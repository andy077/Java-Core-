package com.cpg.lab10.exercise4;

public class Shoe {

	String Name;
	int price;
	Shoe(String Name,int price)
	{
		this.Name=Name;
		this.price=price;
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
	@Override
	public String toString() {
		return "Shoe [Name=" + Name + ", price=" + price + "]";
	}
	
	
}