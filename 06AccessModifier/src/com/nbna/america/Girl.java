package com.nbna.america;

import com.nbna.australia.marryshome.*;


public class Girl extends Marry {

	public Girl() {
		// TODO Auto-generated constructor stub
		
		System.out.println("I am Mary's Girl child and I do not live with my mom in her package");
	}
	public static void main(String args[]){
		
		/*
		 * To Demo what all can GirlChild do herself
		 */
		Girl girl = new Girl();
		girl.eatFoodDisplayedOutside();
		girl.playInMarrysSwimmingPool();
		//girl.switchOnMarrysTV();
		
		/*
		 * To Demo what all GirlChild can do by calling Marry
		 */
		Marry marry = new Marry();		
		marry.eatFoodDisplayedOutside();
	   // marry.playInMarrysSwimmingPool();
		//marry.switchOnMarrysTV();
		
		/*
		 * To Demo what GirlChild can do by calling her brother ie the male child
		 */
		Boy brother = new Boy();
		//brother.eatFoodDisplayedOutside();
		brother.playInMarrysSwimmingPool();
		//brother.switchOnMarrysTV();
		
		
		
		
				
	}
}
