package com.quickserve.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.quickserve.entities.Menu;
import com.quickserve.models.MenuCardModel;
import com.quickserve.repositories.MenuCardRepo;

@Service
public class CustomerAppService {
	
    private static final Logger logger = LoggerFactory.getLogger(CustomerAppService.class);
	
	@Autowired
	MenuCardRepo menuRepo;
	
	@Autowired 
	Gson gson;
	
	public void saveMenuCard(List<MenuCardModel> menuCardData) {
		
		if(menuCardData.isEmpty() || menuCardData == null) {
			logger.info("Empty list found for menuCard data not saving");
			return;
		}
		List<Menu> menuEntity = new ArrayList<>();
		menuCardData.forEach( menuData -> menuEntity.add(prepareMenuEntity(menuData)));
		menuRepo.saveAll(menuEntity);
	}
	
	private Menu prepareMenuEntity(MenuCardModel menuData) {
		
		Menu menu = new Menu();
		Object obj = gson.toJson(menuData.getFoodItems());

		menu.setId(menuData.getQrCode());
		menu.setRestaurantName(menuData.getRestaurantName());
		menu.setMenuData(obj);
		return menu;
	}
	
	
}	
