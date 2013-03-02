package com.nbna.peoplearound;

import com.nbna.roboticwife.HumanoidStella;
import com.nbna.roboticwife.Professional;

public class Manager extends Prof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * To Demo use of interface and how it limits, what manager 
		 * can do with stella
		 */
		Professional stella = new HumanoidStella();
		 
		//Prof stella = new HumanoidStella();
		//stella.attendMeetings();
		//stella.writeCode();
		//stella.cookFood();
		//stella.sharePersonalLife();		 
		//stella.talkNiceWords();		 
		//stella.teachManners();
		 
		 /*
		  * To demo that I can still do if I treat stella as woman instead
		  * of treating her as Professional.
		  */
		 /*HumanoidStella stella = new HumanoidStella();
		 stella.attendMeetings();
		 stella.cookFood();
		 stella.talkNiceWords();
		 stella.sharePersonalLife();
		 stella.teachManners();*/
		 
		 
	}

}
