package com.fis.app.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class FoodService {

	private Swiggy swiggy;
	private DeliveryPerson dpr;;
	private int licence;
	private String operatorName;
	
	public FoodService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodService(Swiggy swiggy, DeliveryPerson dpr, int licence, String operatorName) {
		super();
		this.swiggy = swiggy;
		this.dpr = dpr;
		this.licence = licence;
		this.operatorName = operatorName;
	}
	
	
	public Swiggy getSwiggy() {
		return swiggy;
	}
	public void setSwiggy(Swiggy swiggy) {
		this.swiggy = swiggy;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	
	public DeliveryPerson getDpr() {
		return dpr;
	}
	public void setDpr(DeliveryPerson dpr) {
		this.dpr = dpr;
	}
	public int getLicence() {
		return licence;
	}
	public void setLicence(int licence) {
		this.licence = licence;
	}
	
	@Override
	public String toString() {
		return "FoodService [swiggy=" + swiggy + ", dpr=" + dpr + ", licence=" + licence + ", operatorName="
				+ operatorName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dpr, licence, operatorName, swiggy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodService other = (FoodService) obj;
		return Objects.equals(dpr, other.dpr) && licence == other.licence
				&& Objects.equals(operatorName, other.operatorName) && Objects.equals(swiggy, other.swiggy);
	}
	
	
	
	
}
