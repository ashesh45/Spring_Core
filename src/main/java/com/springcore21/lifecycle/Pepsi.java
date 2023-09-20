package com.springcore21.lifecycle;

public class Pepsi {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("inside init method");
	}
	
	public void destroy()
	{
		System.out.println("inside destroy method");
	}

}
