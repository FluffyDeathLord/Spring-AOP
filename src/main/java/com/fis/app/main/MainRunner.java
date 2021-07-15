package com.fis.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.Swiggy;
import com.fis.app.model.Client;
import com.fis.app.service.ClientService;

//@SuppressWarnings("unused")
public class MainRunner {

	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		
		
		ClientService clientService = (ClientService)spring.getBean("clientService");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		clientService.doOrderFood();
		clientService.doFixAddress();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		clientService.doMakePayment();
		
		System.out.println(" \n\n--------- make payment with argument ---------\n\n");
		clientService.doMakePayment("Paytm");
		
		
	
		
	}
}
