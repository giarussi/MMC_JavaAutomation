package javaExercise11_greetingsApp;

import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		
		//Initialize Known Variables
		String name; 
		
		
		//Get info from user
		System.out.println("Please enter your name: "); 
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();	
		greetUser(name); 
		scanner.close();

	}
	
	public static void greetUser(String username) {
		System.out.println("Hi there " + username + ". Hope you have a fantastic day!"); 
		
	}
	
	

}
