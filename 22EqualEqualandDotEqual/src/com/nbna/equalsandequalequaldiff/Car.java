package com.nbna.equalsandequalequaldiff;

public class Car {

	int numofdoor;
	int vin;
	
	Car(int vin, int numofdoor){
		this.numofdoor = numofdoor;
		this.vin = vin;
	}
	public void add(){
		System.out.println("THis is add");
	}
	
	public boolean equals(Car other){
		
		if(this.vin== other.vin )
			return true;			
		else
			return false; 
		
	}

}
