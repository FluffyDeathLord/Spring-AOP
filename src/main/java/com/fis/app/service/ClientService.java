package com.fis.app.service;

import org.springframework.stereotype.Component;

import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

@Component
public class ClientService {

	public void doOrderFood()
	{
		
		System.out.println(" food ordering code executing .... ");
		
	}
	public void doFixAddress()
	{
		
		System.out.println(" Address fixing code executing .... ");
		
	}
	public void doMakePayment()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doMakePayment(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}
	
	
	
}
