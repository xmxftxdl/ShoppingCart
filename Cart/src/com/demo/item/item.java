package com.demo.item;

public class item {

	public int ID;
	public String Name;
	public int number;
	public int price;
	public item(int ID,String Name, int number,int price) {
		super();
		this.ID=ID;
		this.Name=Name;
		this.number=number;
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
		this.Name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "item [ID=" + ID + ", Name=" + Name + ", number=" + number + ", price=" + price + "]";
	}
	
}
