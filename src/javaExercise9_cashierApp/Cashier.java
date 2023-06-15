package javaExercise9_cashierApp;

import java.util.Scanner;

public class Cashier {
	
	public static void main(String[] args) {
		
		//Initialize variables
		
		double totalPrice = 0; 
		double itemPrice; 
		int itemQuantity; 
		
		//Collect number of items to scan
		System.out.println("Please enter the number of items in your order:");
		Scanner scanner = new Scanner(System.in);
		itemQuantity = scanner.nextInt(); 
		
		//loop to capture cost for each item and accumulate total order cost 
		for(int i=1; i <= itemQuantity ; i++) {
			//int itemNumber = i+1; 
			System.out.println("Enter item " + i + " cost: ");
			itemPrice = scanner.nextDouble(); 
			
			//accumulate the totalCost with additional item cost 
			totalPrice = totalPrice + itemPrice; 
		}
		
		//print out the order total to the cashier
		System.out.println("Order cost is $: " + totalPrice);
		scanner.close();
		
	}

}
