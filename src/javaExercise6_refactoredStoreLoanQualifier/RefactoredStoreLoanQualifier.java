package javaExercise6_refactoredStoreLoanQualifier;

import java.util.Scanner;

/*
 * Demo nested if statements in a LOC Qualifier app that qualifies a person for a line of credit based on specific criteria: 
 * - Customer must make $45,000 a year gross income
 * - Customer must have been employed for 1 year at current job.
 * 
 */
public class RefactoredStoreLoanQualifier {
	public static void main(String[] args) {
		
		//initialize our known values
		
		int reqGrossIncome = 45000;
		int reqEmploymentYears = 1; 
		
		//Get user inputs for additional values
		
		System.out.println("What is your yearly gross income?");
		Scanner scanner = new Scanner(System.in);
		double grossIncome = scanner.nextDouble(); 
		
		System.out.println("How many years have you been employed with your current role?");
		double employmentYears = scanner.nextDouble();
		scanner.close();
		
		// Decision Loan Applicant 
		
		if (grossIncome >= reqGrossIncome && employmentYears >= reqEmploymentYears) {
				System.out.println("Congratulations! You are pre-qualified for a store line of credit!");
		}
		else {
			System.out.println("I'm so sorry. Your current employment / salary do not meet the minimum requirements to qualify for this line of credit. Please apply again later.");
		}
		
	}

}
