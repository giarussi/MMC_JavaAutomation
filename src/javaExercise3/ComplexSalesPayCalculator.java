package javaExercise3;

import java.util.Scanner;

/*
 * Demo else-if to handle payment calculation for following conditions: 
 * - base pay of $750
 * - Exceeding 15 sales for week gets bonus of $250
 * - Exceeding 25 sales for week gets bonus of $500
 * - Exceeding 40 sales for week gets bonus of $1000
 */
public class ComplexSalesPayCalculator {
	
	public static void main(String[] args) {
		
		//Initialize known variables
		
				int salary = 750; 
				int bonus = 250; 
				int bonus2 = 500;
				int bonus3 = 1000;
				int salesQuota = 15; 
				int salesQuota2 = 25; 
				int salesQuota3 = 40;
				
				//Get the information we don't have 
				
				System.out.println("How many sales did employee make this week?"); 
				Scanner scanner = new Scanner(System.in); 
				int sales = scanner.nextInt();
				scanner.close();
				
				//Alternate path for bonus scenario
				
				if(sales >= salesQuota3) {
					salary = salary + bonus3; 
					System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus3);
				}
				else if(sales >= salesQuota2) {
					salary = salary + bonus2;
					System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus2);	
				}
				else if(sales >= salesQuota) {
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
