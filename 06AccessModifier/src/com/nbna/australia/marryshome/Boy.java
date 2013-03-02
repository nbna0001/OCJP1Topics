package com.nbna.australia.marryshome;

//import com.nbna.maryshouse.Marry;

//package com.nbna.maryshouse;

public class Boy extends Marry {

	public Boy() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Marry's Boy Child and will live with my mother in the house");
	}
	/*
	 * To Demo protected Access Modifier
	 */
	public void playInMarrysSwimmingPool(){
		System.out.println("Even throug mother does not allow I will allow");
	}
	
	/*public void switchOnMarrysTV(){
		
		System.out.println("Turn on Mary's TV");
	}*/
	
	public static void main(String args[]){
		
		/*
		 * To demo what all bch can do by himself
		 */
		Boy boy = new Boy();
		boy.eatFoodDisplayedOutside();
		boy.playInMarrysSwimmingPool();
		boy.switchOnMarrysTV();
		
		/*
		 * To Demo what all BoyChild can do by calling Marry
		 */
		Marry marry = new Marry();		
		marry.eatFoodDisplayedOutside();
		marry.playInMarrysSwimmingPool();
		marry.switchOnMarrysTV();
	}
}
