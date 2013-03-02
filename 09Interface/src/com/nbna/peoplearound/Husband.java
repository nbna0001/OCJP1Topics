package com.nbna.peoplearound;

import com.nbna.roboticwife.HumanoidStella;
import com.nbna.roboticwife.Professional;
import com.nbna.roboticwife.Wife;

public class Husband {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i =10;
		//String i;
		/*
		 * To Demo use of interface and how it limits what I can do with
		 * my wife
		 */
		
		 Wife stella = new HumanoidStella();
		// Wife stella = new Wife();
		 stella.cookFood();
		 stella.sharePersonalLife();		 
		 //stella.talkNiceWords();		 
		//stella.teachManners();
	 
		 /*
		  * To demo that I can still see stella as a woman 
		  */
		/*HumanoidStella stella = new HumanoidStella();
		 stella.attendMeetings();
		 stella.cookFood();
		 stella.talkNiceWords();
		 stella.sharePersonalLife();
		 stella.teachManners();*/
		 
	 
		 /*
		  * It is possible that my wife works for me, then what should I do.
		  * Import both wife and professional
		  * Depending on how I look at her she will behave accordingly
		  */
		  //Professional stella = new HumanoidStella();
		  //stella.cookFood();
		  //stella.sharePersonalLife();		 
		  //stella.talkNiceWords();		 
		  //stella.teachManners();
		  //stella.attendMeetings();		 
	}

}
