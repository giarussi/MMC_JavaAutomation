package javaExercise12_CreditCheckApp;

import java.util.Scanner;

public class CreditCheck {
	
	 //instantiate scanner
	static Scanner scanner = new Scanner(System.in); 
	
	//initialize our variables
			static int requiredSalary = 25000; 
			static int requiredCredit = 700; 
			
	
	public static void main(String[] args) {
		
		double salary = getUserSalary(); 
		int credit = getUserCredit(); 
		
		showResult(checkQualification(credit, salary));
		
		scanner.close(); 
		
	}
		//request salary 
	public static double getUserSalary() {
		System.out.println("Please enter your current salary: "); 
		double userSalary = scanner.nextDouble(); 
		return userSalary; 
	}
		
		//request credit 
	public static int getUserCredit() {	
		System.out.println("Please enter your current credit score: "); 
		int userCredit = scanner.nextInt();
		return userCredit; 
		
	}
		//Run Qualification
	
	public static boolean checkQualification(int creditScore, double salary) { 
		
		if(creditScore >= requiredCredit && salary >= requiredSalary) {
			return true; 
		}
		else {
			return false; 
		}
		
	}
		//Display Result
	public static void showResult(boolean isQualified) {
		
		if (isQualified) {
			System.out.println("Congratulations! You qualify for the credit line."); 
		}
		else {
			System.out.println("I'm sorry, you don't meet minimum requirements for this credit line. Please try again later.");
			}
	}

}
