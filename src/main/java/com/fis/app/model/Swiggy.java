package com.fis.app.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@SuppressWarnings("serial")
@SuppressWarnings("serial")
@Component
@Scope("prototype")
public class Swiggy implements Serializable,Comparable<Swiggy> {

	@Value("${Swiggy.number}")
	private int swiggyNumber;
	@Value("${Swiggy.name}")
	private String swiggyName;
	
	@Autowired
	private Order o;
	@Autowired
	private Address a;
	
	
	
	public Swiggy() {
		
		super();
		System.out.println(" Constructor called");
	}
	public Swiggy(int swiggyNumber, String swiggyName) {
		super();
		this.swiggyNumber = swiggyNumber;
		this.swiggyName = swiggyName;
	}
	
	
	public int getSwiggyNumber() {
		return swiggyNumber;
	}
	public void setSwiggyNumber(int swiggyNumber) {
		this.swiggyNumber = swiggyNumber;
	}
	public String getSwiggyName() {
		return swiggyName;
	}
	public void setSwiggyName(String swiggyName) {
		this.swiggyName = swiggyName;
	}
	public Order getO() {
		return o;
	}
	public void setO(Order o) {
		this.o = o;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	
	public int getCarNumber() {
		return swiggyNumber;
	}
	public void setCarNumber(int carNumber) {
		this.swiggyNumber = carNumber;
	}
	public String getCarName() {
		return swiggyName;
	}
	public void setCarName(String carName) {
		this.swiggyName = carName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((swiggyName == null) ? 0 : swiggyName.hashCode());
		result = prime * result + swiggyNumber;
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
		Swiggy other = (Swiggy) obj;
		if (swiggyName == null) {
			if (other.swiggyName != null)
				return false;
		} else if (!swiggyName.equals(other.swiggyName))
			return false;
		if (swiggyNumber != other.swiggyNumber)
			return false;
		return true;
	}
	
	
	
	@Override
	public int compareTo(Swiggy swiggy) {
		return this.swiggyName.compareTo(swiggy.swiggyName);
	}
	@Override
	public String toString() {
		if(o == null)
		{
			return swiggyName+"- Address Not Yet Set  - "+swiggyNumber+" - "+a;
		}
		return swiggyName+" - "+o.getOrderName()+" - "+swiggyNumber+" - "+a;
	}
	
	// -----------  Spring life cycle methods -------
	
	public void doInIt()
	{
		System.out.println(" do init called ");
		// provide path to the file 
	}
	
	public void doDestroy()
	{
		// write data to the file
		System.out.println(" do destroy  called ");
	}
	
	
}//end class





















