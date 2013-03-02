package com.nbna.hashcode;

public class Car {
	
	int vin;
	int numofdoor;
	String model;

	Car(int vin, int numofdoor, String mod) {		
		this.vin = vin;
		this.numofdoor = numofdoor;
		this.model=mod;
		
	}
	
	/*
	 *4) To demo how to override the toString method
	 */
	public String toString(){		
		return "The vin number is: "+vin+" The number of doors on the car is: "+ numofdoor+ " Model" +model;
	}

}
