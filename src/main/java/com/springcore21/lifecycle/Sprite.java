package com.springcore21.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sprite implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Sprite() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sprite [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("taking sprite: init");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("going out of sprite:destroy");
		
	}
	

}
