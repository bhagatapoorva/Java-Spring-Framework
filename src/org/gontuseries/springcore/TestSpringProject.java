package org.gontuseries.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigurationFile.xml");
		
		Restaurant resObj =  (Restaurant) context.getBean("restaurantBean");
		Party partyObj = (Party) context.getBean("partyBean"); 
		
		resObj.greetCustomer();
		resObj.prepareHotDrink();
		resObj.waitersList();
		resObj.waitersAgeWithName();
		System.out.println(partyObj.greetVisitors());
		
	}

}
