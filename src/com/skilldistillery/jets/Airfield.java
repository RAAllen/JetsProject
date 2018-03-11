package com.skilldistillery.jets;

public class Airfield {
	private Jet[] jets = new Jet[100];

	public Airfield() {
		JetImpl ji1 = new JetImpl("Cessna 172", 175, 801, 307_500);
		JetImpl ji2 = new JetImpl("Beechcraft Bonanza", 203, 716, 815_000);
		CargoPlane cp1 = new CargoPlane("Airbus A300", 518, 3340, 105_000_000, 42);
		CargoPlane cp2 = new CargoPlane("Boeing 777", 554, 8128, 339_200_000, 33);
		FighterJet fj1 = new FighterJet("Lockheed Martin F-22 Raptor", 1220, 1840, 150_000_000, 100);
		FighterJet fj2 = new FighterJet("Lockheed Martin F-35 Lightning II", 1200, 1200, 94_600_000, 75);
		PassengerPlane pp1 = new PassengerPlane("Boeing 737", 838, 3723, 102_200_000, 233);
		PassengerPlane pp2 = new PassengerPlane("Airbus A380", 561, 9445, 445_600_000, 546);
		SkyWriter sw1 = new SkyWriter("Cessna 172", 175, 801, 307_500, 100);
		SkyWriter sw2 = new SkyWriter("Feiseler Fi 56", 109, 236, 1_000_000_000, 50);
	
		jets[0] = ji1;
		jets[1] = ji2;
		jets[2] = cp1;
		jets[3] = cp2;
		jets[4] = fj1;
		jets[5] = fj2;
		jets[6] = pp1;
		jets[7] = pp2;
		jets[8] = sw1;
		jets[9] = sw2;		
	}
	
	public void printJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());
			}
		}
	}
	
	public void flyAll() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i].fly(i, i);
			}
		}
	}
	
	public void getFastestJet() {
		Jet fastestJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastestJet.getSpeed()) {
					fastestJet = jets[i];
				}
			}
		}
		System.out.println(fastestJet.toString());
	}
	
	public void getLongestRange() {
		Jet longestRangedJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longestRangedJet.getRange()) {
					longestRangedJet = jets[i];
				}
			}
		}
		System.out.println(longestRangedJet.toString());
	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}
	
}
