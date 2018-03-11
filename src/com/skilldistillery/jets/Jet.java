package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet() {
		
	}
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly(double speed, int range) {
		double maxDistance = (range / speed);
		double speedInMach = getSpeedInMach(speed);
		toString();
		System.out.println("This Jet can fly " + maxDistance + " hours before running out of fuel.");
		System.out.println("This Jet can fly at Mach " + speedInMach + " Speed.");
	}
	
	public double getSpeedInMach(double speed) {
		double speedInMach = speed * 0.00131;
		return speedInMach;
	}
	
	@Override
	public String toString() {
		return "\nJet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

}
