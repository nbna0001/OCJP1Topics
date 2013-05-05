package com.nbna.staticexample1;

public class Calculator {
	
	/*
	 * To demo usage of static variables
	 */
	static int calinstance_count;  
	
	public Calculator() {
		calinstance_count++;
		// TODO Auto-generated constructor stub
		System.out.println("Cal is at your service");
			 
		
	}
	
	
	public Calculator(String saysomething){	
		calinstance_count++;
		System.out.println("Cal is busy " + saysomething);				
	}
}
