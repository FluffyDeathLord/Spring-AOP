package com.fis.app.model;

import org.springframework.stereotype.Component;

@Component
public class DeliveryPerson {
	
	private String dName;
	private int id;
	private int starRatings;
	private int age;
	
	public DeliveryPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeliveryPerson(String dName, int id, int starRatings, int age) {
		super();
		this.dName = dName;
		this.id = id;
		this.starRatings = starRatings;
		this.age = age;
	}
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStarRatings() {
		return starRatings;
	}
	public void setStarRatings(int starRatings) {
		this.starRatings = starRatings;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dName == null) ? 0 : dName.hashCode());
		result = prime * result + id;
		result = prime * result + starRatings;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryPerson other = (DeliveryPerson) obj;
		if (age != other.age)
			return false;
		if (dName == null) {
			if (other.dName != null)
				return false;
		} else if (!dName.equals(other.dName))
			return false;
		if (id != other.id)
			return false;
		if (starRatings != other.starRatings)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DeliveryPerson [dName=" + dName + ", id=" + id + ", starRatings=" + starRatings + ", age=" + age
				+ "]";
	}
	
	
	
	

}
