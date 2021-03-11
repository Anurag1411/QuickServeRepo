package com.quickserve.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.quickserve.models.MenuCardModel;
import com.quickserve.services.CustomerAppService;


@RestController
@RequestMapping( value = "/menu")
public class CustomerAppController {
	
    private static final Logger logger = LoggerFactory.getLogger(CustomerAppController.class);
	
	@Autowired
	Gson gson;
	
	@Autowired
	CustomerAppService customerService;
	
	@GetMapping(value = "/healthcheck")
	public String healthCheck() {
		return "READY TO SERVE";
	}
	
	@PostMapping(value = "/save")
	@ResponseStatus(value = HttpStatus.OK)
	public void saveMenuData(@RequestBody List<MenuCardModel> menuCard) {
		logger.info("menu card event received for saving {} ", gson.toJson(menuCard));
		customerService.saveMenuCard(menuCard);
	}
	
	
	
}
