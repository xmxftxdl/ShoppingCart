package com.demo.productElement;

public class Product {

	public int ID;
	public String Name;
	public int price;
	
	public Product(int ID,String Name, int price) {
		super();
		this.ID=ID;
		this.Name=Name;
		this.price=price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
