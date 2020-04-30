package com.cognizant.model;

import com.cognizant.interfaces.IAccessoryRepair;
import com.cognizant.interfaces.IPhoneRepair;

// Class responsible for Repair of Phone and Accessories

public class PhoneRepair implements IPhoneRepair,IAccessoryRepair {

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		
		//Printing to the console
		System.out.println(String.format("%s repair accepted!", accessoryType));
		
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {

		//Printing to the console
		System.out.println(String.format("%s repair accepted!",modelName));
		
	}

}
