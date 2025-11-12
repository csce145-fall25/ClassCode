package com.chapter10;

public class Item {
	private String sku;
	private double price;
	private int quantity;
	private String description;
	
	public Item(String sku,double price,int quantity, String description) {
		this.sku = sku;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
