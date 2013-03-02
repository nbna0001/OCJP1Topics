package com.nbna.clone;

public class TestClass {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setMake("Tyota");
		
		Car c2;//= new Car();
		
		try {
			/*
			 * 1) To demo how cloning is done
			 */
			c2 = (Car) c1.clone();
			System.out.println("Make of the clone "+ c2.getMake());
			System.out.println("Make of the original "+ c1.getMake());
			/*
			 * 2) To demo that a different object is created now 
			 */
			c1.setMake("Nissan");			
			System.out.println("Make of the clone "+c2.getMake());			
			System.out.println("Make of the origianl "+c1.getMake());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
