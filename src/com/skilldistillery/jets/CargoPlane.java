package com.skilldistillery.jets;

public class CargoPlane extends Jet {
	private int cargoCapacity;

	public CargoPlane() {
		super();
	}

	public CargoPlane(String model, double speed, int range, long price, int cargoCapacity) {
		super(model, speed, range, price);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void loadCargo() {
		System.out.println("This Cargo Plane can hold " + cargoCapacity + " tons of cargo.");
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

}
