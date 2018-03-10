package com.skilldistillery.jets;

public class PassengerPlane extends Jet {
	private int numberOfPassengers;

	public PassengerPlane() {
		super();
	}

	public PassengerPlane(String model, double speed, int range, long price, int numberOfPassengers) {
		super(model, speed, range, price);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public void loadPassengers() {
		System.out.println("This Passenger Plane can carry " + numberOfPassengers + " people.");
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

}
