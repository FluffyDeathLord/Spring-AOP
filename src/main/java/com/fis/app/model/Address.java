package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("${a.add}")
	private String add;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String add) {
		super();
		this.add = add;
	}
	

	

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	

	@Override
	public String toString() {
		return "Address [add=" + add + "]";
	}
	
	
}
