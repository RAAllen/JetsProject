package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private static Airfield airfield = new Airfield();
	private static Scanner scanner = new Scanner(System.in);

	public JetsApplication() {
	}

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		System.out.println("Welcome to the Airfield!");
		displayUserMenu();
		int userChoice = scanner.nextInt();
		while (userChoice != 10) {
			if (userChoice == 1) {
				airfield.printJets();
			} else if (userChoice == 2) {
				airfield.flyAll();
			} else if (userChoice == 3) {
				airfield.getFastestJet();
			} else if (userChoice == 4) {
				airfield.getLongestRange();
			} else if (userChoice == 5) {

			} else if (userChoice == 6) {

			} else if (userChoice == 7) {

			} else if (userChoice == 8) {

			} else if (userChoice == 9) {

			} else {
				System.err.println("It would appear you made an incorrect selection, please choose again.");
			}
		}
		System.out.println("Goodbye!");
	}

	private static void displayUserMenu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View The Jet With The Longest Range");
		System.out.println("5. Load All Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Load Passenger Planes");
		System.out.println("8. Send A Sky Message");
		System.out.println("9. Add Jet To Fleet");
		System.out.println("10. Quit");
	}

	public Airfield getAirfield() {
		return airfield;
	}

	public void setAirfield(Airfield airfield) {
		this.airfield = airfield;
	}

}
