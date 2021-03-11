package com.quickserve.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@Entity
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
@Table(name = "menu")
public class Menu {
	
	@Id
	@Column(name = "id")
	String id;
	
	@Column(name = "restaurantname")
	String restaurantName;
	
	@Type(type = "jsonb")
	@Column(name = "menudata")
	@Basic(fetch = FetchType.LAZY)
	private Object menuData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Object getMenuData() {
		return menuData;
	}

	public void setMenuData(Object menuData) {
		this.menuData = menuData;
	}
	
}
