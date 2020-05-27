package org.gontuseries.springcore;

import java.util.List;
import java.util.Map;

public class Restaurant {
	
	public String welcomeNote;
	public String welcomeTea; 
	IHotDrink hotDrink, hotDrink2;
	private List restaurantWaitersList;
	private Map<String, Integer> waiterNameAndAge;

	
	//constructor method for dependency injection
	Restaurant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	} 
	
	//setter method for dependency injection	
	public void setHotDrink2(IHotDrink hotDrink2) {
		this.hotDrink2 = hotDrink2;
	}

	public void setWelcomeTea(String welcomeTea) {
		this.welcomeTea = welcomeTea;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	// setter method for Java List (Collection) injection
	public void setRestaurantWaitersList(List restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}
	
	// setter method for Java Map (Collection) injection, similar structure to be followed for Set (Collection)
	public void setWaiterNameAndAge(Map<String, Integer> waiterNameAndAge) {
		this.waiterNameAndAge = waiterNameAndAge;
	}
	

	public void greetCustomer(){
		System.out.println(welcomeNote + " " + welcomeTea);
	}
	
	public void prepareHotDrink(){
		System.out.println("Hot Drink 1");
		hotDrink.prepareHotDrink();
		System.out.println("Hot drink 2");
		hotDrink2.prepareHotDrink();
	}
	
	public void waitersList(){
		System.out.println("The following waiters work here: " + restaurantWaitersList);
	}
	
	public void waitersAgeWithName(){
		System.out.println(waiterNameAndAge);
	}
	
	
	

}


