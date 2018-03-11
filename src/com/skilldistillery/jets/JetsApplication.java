package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private static Airfield airfield = new Airfield();
	private static Scanner scanner = new Scanner(System.in);

	public JetsApplication() {
	}

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("            Welcome to the Airfield!");
		run();
	}

	private static void run() {
		displayUserMenu();
		int userChoice = scanner.nextInt();
		if (userChoice == 1) {
			airfield.printJets();
			run();
		} else if (userChoice == 2) {
			airfield.flyAll();
			run();
		} else if (userChoice == 3) {
			airfield.getFastestJet();
			run();
		} else if (userChoice == 4) {
			airfield.getLongestRange();
			run();
		} else if (userChoice == 5) {
			airfield.loadAllCargoPlanes();
			run();
		} else if (userChoice == 6) {
			airfield.dogfight();
			run();
		} else if (userChoice == 7) {
			airfield.loadAllPassengerPlanes();
			run();
		} else if (userChoice == 8) {
			airfield.writeAllSkyWriters();
			run();
		} else if (userChoice == 9) {
//			airfield.addJet();
			run();
		} else if (userChoice == 10) {
			System.out.println("Goodbye!");
		} else {
			System.err.println("It would appear you made an incorrect selection, please choose again.");
		}
	}

	private static void displayUserMenu() {
		System.out.println("");
		System.out.println("\n   * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("   *                                               *");
		System.out.println("   *     1. List Fleet                             *");
		System.out.println("   *     2. Fly All Jets                           *");
		System.out.println("   *     3. View Fastest Jet                       *");
		System.out.println("   *     4. View The Jet With The Longest Range    *");
		System.out.println("   *     5. Load All Cargo Jets                    *");
		System.out.println("   *     6. Dogfight!                              *");
		System.out.println("   *     7. Load Passenger Planes                  *");
		System.out.println("   *     8. Send A Sky Message                     *");
		System.out.println("   *     9. Add Jet To Fleet                       *");
		System.out.println("   *     10. Quit                                  *");
		System.out.println("   *                                               *");
		System.out.println("   * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	}

	public Airfield getAirfield() {
		return airfield;
	}

	public void setAirfield(Airfield airfield) {
		JetsApplication.airfield = airfield;
	}

}
