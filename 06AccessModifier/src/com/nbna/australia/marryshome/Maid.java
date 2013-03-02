package com.nbna.australia.marryshome;

//import com.nbna.*;
public class Maid {

	public Maid() {
		// TODO Auto-generated constructor stub
		
		System.out.println("I am the maid and I will live with my master in this packaege for ever");
	}
	
		
	public static void main(String args[]){
		
		/*
		 * To Demo what all maid can do by herself
		 */		
		Maid maid = new Maid();
		//maid.eatFoodDisplayedOutside();
		//maid.playInMarrysSwimmingPool();
		//maid.switchOnMarrysTV();
		
		/*
		 * To Demo what all maid can do by calling Marry
		 */
		Marry marry = new Marry();		
		marry.eatFoodDisplayedOutside();
		marry.playInMarrysSwimmingPool();
		marry.switchOnMarrysTV();		
		
		
	}
	
}
