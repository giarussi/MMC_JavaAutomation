package javaExercise2;

import java.util.Scanner;

/* 
 * Pay Calculator that demonstrates basic if statements: 
 * 	- All floor sales people get base pay of $750 
 *  - Sales people that exceed 15 sales for the week will get an additional bonus of $250
 *  */

public class SalesPeoplePayCalculator {

	public static void main(String[] args) {
		
		
		//Initialize known variables
		
		int salary = 750; 
		int bonus = 250; 
		int salesQuota = 15; 
		
		//Get the information we don't have 
		
		System.out.println("How many sales did employee make this week?"); 
		Scanner scanner = new Scanner(System.in); 
		int sales = scanner.nextInt();
		scanner.close();
		
		//Alternate path for bonus scenario
		
		if(sales >= salesQuota) {
			salary = salary + bonus; 
			System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus);
		}
		
		else {
			int quotaDifference = salesQuota - sales; 
			System.out.println("You did not meet the minimum sales quota. You were short by: " + quotaDifference + " sales. Try again next month!");
		}
		
		//Output pay amount to user
		
		System.out.println("Employee Pay Amount: $" + salary);
	}
}
