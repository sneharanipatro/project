package com.zomato.foodcart;


//pogo class
public class Food {
	
	private int id;
	private String items;
	private double price;
	
	public Food(int id, String items, double price) {
		this.id = id;
		this.items = items;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
