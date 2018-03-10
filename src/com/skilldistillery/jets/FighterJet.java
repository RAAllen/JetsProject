package com.skilldistillery.jets;

public class FighterJet extends Jet {
	private int firePower;

	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price, int firePower) {
		super(model, speed, range, price);
		this.firePower = firePower;
	}
	
	public void readyGuns() {
		System.out.println("This Fighter Jet has " + firePower + " rounds it can fire per minute.");
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}
	
}
