package com.cognizant.model;

import com.cognizant.interfaces.IOrder;

// Class for taking order for the new phones

public class PhoneOrder implements IOrder {

	@Override
	public void ProcessOrder(String modelName) {
		
		//Printing to the console
		System.out.println(String.format("%s order accepted!", modelName));
		
	}

}
