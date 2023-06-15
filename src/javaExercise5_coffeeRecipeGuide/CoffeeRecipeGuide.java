package javaExercise5_coffeeRecipeGuide;

import java.util.Scanner;

/*
 * Switch Demo: Coffee Recipe App with requirements to prompt user for drink and based on drink selection present specific recipe / instructions
 * back to user. 
 */
public class CoffeeRecipeGuide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Enter our known variables
		int coffee; 
		String menu = " 1. Jeb's Flat White \n 2. The Misty Mountain \n 3. The Honey Badger "; 
		char size; 
		//Collect information we don't have 
		
		System.out.println("Hello! Welcome to Jeb's Special Coffee Recipe Guide!"); 
		System.out.println("Please enter the coffee drink you are attempting to make from the following menu using the item number:"); 
		System.out.println(menu);
		
		Scanner scanner = new Scanner(System.in);
		coffee = scanner.nextInt();
		
		System.out.println("What size of drink will you be making? (S/M/L)"); 
		size = scanner.next().charAt(0); 
		
		//Write our Decision Logic for coffee recipes
		
		switch (coffee) {
		
		case 1: 
			
			switch (size) {
			
			case 'S': 
				System.out.println("*** Jeb's Flat White ***"); 
				System.out.println(" - 2 shots espresso \n - .25 cup whole milk (light froth) \n .10 ts vanilla extract"); 
				System.out.println ("-----------------------------------------------"); 
				System.out.println ("1. Make epresso and add to mug \n 2. Warm and froth milk to light froth \n 3. Add milk to espresso in mug \n 4. Finish with vanilla extract"); 
				break; 
				
				
			case 'M': 
				System.out.println("*** Jeb's Flat White ***"); 
				System.out.println(" - 3 shots espresso \n - .5 cup whole milk (light froth) \n .25 ts vanilla extract"); 
				System.out.println ("-----------------------------------------------"); 
				System.out.println ("1. Make epresso and add to mug \n 2. Warm and froth milk to light froth \n 3. Add milk to espresso in mug \n 4. Finish with vanilla extract"); 
				break; 
				
			case 'L': 
				System.out.println("*** Jeb's Flat White ***"); 
				System.out.println(" - 4 shots espresso \n - .75 cup whole milk (light froth) \n .5 ts vanilla extract"); 
				System.out.println ("-----------------------------------------------"); 
				System.out.println ("1. Make epresso and add to mug \n 2. Warm and froth milk to light froth \n 3. Add milk to espresso in mug \n 4. Finish with vanilla extract"); 
				break; 	
			}
			break;
		case 2: 
			System.out.println("*** The Misty Mountain***"); 
			System.out.println(" - 3 shots espresso \n - .5 cup milk of choice (heavy froth) \n 1 tsp lavender \n 1 tsp hazelnut"); 
			System.out.println ("-----------------------------------------------"); 
			System.out.println ("1. Make epresso and add to mug \n 2. Warm and froth milk to heavy froth \n 3. Add milk to espresso in mug \n 4. Finish with syrups"); 
			break; 
			
		case 3: 
			System.out.println("*** The Honey Badger***"); 
			System.out.println(" - 3 shots espresso \n - .5 cup milk of choice (medium froth) \n .25 tsp vanilla extract \n 1 tsp honey"); 
			System.out.println ("-----------------------------------------------"); 
			System.out.println ("1. Make epresso and add to mug \n 2. Warm and froth milk to heavy froth \n 3. Add milk to espresso in mug \n 4. Finish with honey and vanilla extract"); 
			break; 
		
		default:
			System.out.println("You must enter a valid drink value by it's corresponding number. Please enter a valid drink selection next time."); 
			break; 
		}
		
		System.out.println("Have a fantastic day!"); 

	}

}
