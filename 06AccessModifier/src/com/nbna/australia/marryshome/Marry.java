package com.nbna.australia.marryshome;

public class Marry {	
	
	public Marry() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Marry");
		
	}
	/*
	 * To Demo private Access Modifier
	 */
	private void sleepOnMarrysBed(){
		
		System.out.println("Sleep on Mary's bed");
	}
	
	/*
	 * To Demo default or not access Access Modifier
	 */
	void switchOnMarrysTV(){
		
		System.out.println("Turn on Mary's TV");
	}
	
	/*
	 * To Demo protected Access Modifier
	 */
	protected void playInMarrysSwimmingPool(){
		System.out.println("Play in Marry's Swimming Pool");
	}
	
	/*
	 * To Demo public Access Modifier
	 */
	
	public void eatFoodDisplayedOutside(){
		System.out.println("Eat Food Displayed by Marry");
	}
	
	public static void main(String args[]){
		/* 
		 * To demo what all Marry can do by herself
		 */
		Marry marry = new Marry();
		marry.eatFoodDisplayedOutside();
		marry.playInMarrysSwimmingPool();
		marry.switchOnMarrysTV();
		marry.sleepOnMarrysBed();
		
	}
}
