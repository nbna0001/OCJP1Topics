package com.nbna.deepcloning;

public class TestClass {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setMake("Tyota");	
		
		ParkingAddress p = new ParkingAddress();		
		p.setZipcode(58122);
		c1.setAddress(p);
		
		Car c2 = new Car();
		
		try {
			
			c2 = (Car) c1.clone();
			System.out.println("Before changing the original");
			System.out.println("Address the original object is: "+ c1.getAddress().getZipcode());			
			System.out.println("Address the clone object is: "+ c2.getAddress().getZipcode());
			
			ParkingAddress p1 = new ParkingAddress();			
			p.setZipcode(48087);
			c1.setAddress(p);
			
			/*
			 * To demo that only original address change because of deep copying
			 */
			System.out.println("After changing the original");
			System.out.println("Address the original object is: "+ c1.getAddress().getZipcode());			
			System.out.println("Address the clone object is: "+ c2.getAddress().getZipcode());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
