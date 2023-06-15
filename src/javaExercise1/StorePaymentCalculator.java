package javaExercise1;

import java.util.Scanner;

public class StorePaymentCalculator {
	
	public static void main(String[]args) {
		
		double payRate;
		
		// 1. Get employee’s number of hours worked
		System.out.println("Enter the number of hours worked by employee: ");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		// 2. Get employee’s hourly pay rate
		System.out.println("Enter employee hourly pay rate: ");
		payRate = scanner.nextDouble();
		scanner.close();
		
		// 3. Multiply hours by pay rate
		double totalPay = hours * payRate;
		
		// 4. Display result
		System.out.println("Employee pay = " + totalPay);
		
		
	}

}
