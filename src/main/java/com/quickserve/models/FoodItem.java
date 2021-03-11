package com.quickserve.models;

public class FoodItem {
	
	String name;
	
	String price;
	
	String quantity;
	
	boolean availability;
	
	boolean speciality;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean isSpeciality() {
		return speciality;
	}

	public void setSpeciality(boolean speciality) {
		this.speciality = speciality;
	}
	
}
