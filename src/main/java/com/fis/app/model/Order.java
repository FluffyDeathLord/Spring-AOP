package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Value("${order.name}")
	private String orderName;
	@Value("1200")
	private int price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderName, int price) {
		super();
		this.orderName = orderName;
		this.price = price;
		
	}
	
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", price=" + price + "]";
	}
	

	
}
