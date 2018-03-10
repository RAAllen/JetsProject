package com.skilldistillery.jets;

public class SkyWriter extends Jet {
	private int numberOfLetters;

	public SkyWriter() {
		super();
	}

	public SkyWriter(String model, double speed, int range, long price, int numberOfLetters) {
		super(model, speed, range, price);
		this.numberOfLetters = numberOfLetters;
	}
	
	public void getMaxMessageLength() {
		System.out.println("This Skywriting Jet can print out a message with a maximum length of " + numberOfLetters + " characters.");
	}

	public int getNumberOfLetters() {
		return numberOfLetters;
	}

	public void setNumberOfLetters(int numberOfLetters) {
		this.numberOfLetters = numberOfLetters;
	}

}
