package org.gontuseries.springcore;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Hot drink prepared and served");
	}

}
