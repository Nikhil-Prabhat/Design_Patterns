package com.cognizant.main;

import java.util.Scanner;

import com.cognizant.model.PhoneOrder;
import com.cognizant.model.PhoneRepair;

public class Test {

	public static void main(String[] args) {
		
		//Initializing the scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to our site. Would you like to order or repair?");
		
		//Taking the input for option
		String processOption = sc.nextLine();
		
		//Instantiating the classes
		PhoneOrder phoneOrder = new PhoneOrder();
		PhoneRepair phoneRepair = new PhoneRepair();
		
		//Initializing the variable  for product details
		String productDetail;

		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model");
			productDetail = sc.nextLine();
			phoneOrder.ProcessOrder(productDetail);
			break;

		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine();
			if (productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine();
				phoneRepair.ProcessPhoneRepair(productDetail);
			} else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine();
				phoneRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			break;
		}
	}

}
