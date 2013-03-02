package com.nbna.europe;

import com.nbna.australia.marryshome.Boy;
//import com.nbna.australia.marryshome.Marry;

public class BoysChild extends Boy{

	public BoysChild() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * To demo what all bch can do by himself
		 */
		BoysChild boychild = new BoysChild();
		boychild.eatFoodDisplayedOutside();
		boychild.playInMarrysSwimmingPool();
		//boychild.switchOnMarrysTV();
		
		/*
		 * To Demo what all BoyChild can do by calling Marry
		 */
		//Marry marry = new Marry();		
		//marry.eatFoodDisplayedOutside();
		//marry.playInMarrysSwimmingPool();
		//marry.switchOnMarrysTV();

	}

}
