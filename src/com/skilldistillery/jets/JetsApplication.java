package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private Airfield airfield = new Airfield();
	
	public JetsApplication() {
	}
	
	public static void main(String[] args) {
		run();
	}
	
	private static void run() {
		System.out.println("Welcome to the Airfield!");
		displayUserMenu();
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		if (userChoice == 1) {
			
		} else if (userChoice == 2) {
			
		} else if (userChoice == 3) {
			
		} else if (userChoice == 4) {
			
		} else if (userChoice == 5) {
			
		} else if (userChoice == 6) {
			
		} else if (userChoice == 7) {
			
		} else if (userChoice == 8) {
			
		} else if (userChoice == 9) {
			
		} else {
			System.err.println("It would appear you made an incorrect selection, please choose again.");
		}
		
	}
	
	private static void displayUserMenu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. Load All Cargo Jets");
		System.out.println("5. Dogfight!");
		System.out.println("6. Load Passenger Planes");
		System.out.println("7. Send A Sky Message");
		System.out.println("8. Add Jet To Fleet");
		System.out.println("9. Quit");
	}
}
