package com.Auction_Model;

public class Item {
	 
	
	String product;
	int price;
	int quantity;
	String  sold;
	
	public Item(String product, int price, int quantity, String sold) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.sold = sold;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSold() {
		return sold;
	}

	public void setSold(String sold) {
		this.sold = sold;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", price=" + price + ", quantity=" + quantity + ", sold=" + sold + "]";
	}
	

}
