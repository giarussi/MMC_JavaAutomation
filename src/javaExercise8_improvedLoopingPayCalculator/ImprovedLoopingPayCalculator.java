package javaExercise8_improvedLoopingPayCalculator;

import java.util.Scanner;

public class ImprovedLoopingPayCalculator {

	public static void main(String[] args) {
		
		//Initialize Values
		double salary; 
		int baseSalary = 750;
		int bonus = 250; 
		int bonus2 = 500;
		int bonus3 = 1000;
		int salesQuota = 15; 
		int salesQuota2 = 25; 
		int salesQuota3 = 40;
		int maxHoursWorked = 40; 
		double minHoursWorked = .25; 
		boolean continueProgram; 

		
		do {
			
		//add looping logic to continue running program for user until they are done entering employee data
			Scanner scanner = new Scanner(System.in);
		//reset salary
			salary = 0;
		
			//getAdditionalInfo 
		
		System.out.println("What is the type of employee? (regular/salary): "); 
		String employeeType = scanner.next();
		System.out.println("Employee type = " + employeeType);
		
		if(employeeType.equalsIgnoreCase("salary")) {
			
			System.out.println("How many sales did employee make this week?"); 
			int sales = scanner.nextInt();
			
			if(sales >= salesQuota3) {
				salary = baseSalary + bonus3; 
				System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus3);
			}
			else if(sales >= salesQuota2) {
				salary = baseSalary + bonus2;
				System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus2);	
			}
			else if(sales >= salesQuota) {
				salary = baseSalary + bonus;
				System.out.println("Congratulations! You've met the sales quota for the week and will receive an additional bonus of $" + bonus);
			}
			
			else {
				int quotaDifference = salesQuota - sales; 
				salary = baseSalary; 
				System.out.println("You did not meet the minimum sales quota. You were short by: " + quotaDifference + " sales. Try again next month!");
			}
		}
		
		else if(employeeType.equalsIgnoreCase("regular")) {
			//1. Get employee’s number of hours worked
			
			System.out.println("Enter the hours employee worked (min .25):");
			double hours = scanner.nextDouble();
	
			
			//Validate Input Enhancement
			while(hours>maxHoursWorked || hours < minHoursWorked) {
				System.out.println("You've entered invalid employee hours... please re-ienter employee hours for the week (.25 - 40): ");
				hours = scanner.nextDouble(); 
			}
			//2. Get employee’s hourly pay rate
			
			System.out.println("Enter the employee hourly payrate:");
			double payRate = scanner.nextDouble(); 
			
			
			//3. Multiply hours by pay rate
			double totalPay = hours * payRate;
			salary = totalPay; 
			
		}
		else {
			System.out.println("You've entered an invalid employee type... please re-enter a valid employee type (regular / salary)");
			
		}
		
		//Output pay amount to user
		
		System.out.println("Employee Pay Amount: $" + salary);
		
		//prompt user to continue running program
		
				System.out.println("Do you want to calculate pay for another employee?(yes/no)"); 
				String response = scanner.next();
				
				if(response.equalsIgnoreCase("Yes")){
					continueProgram = true; 
				}
				else {
					continueProgram = false; 
					System.out.println("Have a great day!"); 
					scanner.close();
				}
		}while(continueProgram);
		
		}
	
}
