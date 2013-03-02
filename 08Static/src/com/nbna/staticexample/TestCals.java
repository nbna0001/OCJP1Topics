package com.nbna.staticexample;

public class TestCals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * To Demo how static variable is used 
		 */
		Calculator cal = new Calculator();
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		 //System.out.println("Instances initialized so far:"+Calculator.calinstance_count+ " ascessed by the class\n");
		// System.out.println("Instances initialized so far:"+ cal.calinstance_count+ " ascessed by the object\n");
		 /*
		  * To Demo that static variables can also be ascessed by sublclasses 
		  */
		 ScientificCalculator scal1 = new ScientificCalculator();	
		 System.out.println("Instances initialized so far:"+ ScientificCalculator.calinstance_count+ " ascessed by the subclass\n");
		 System.out.println("Instances initialized so far:"+ scal1.calinstance_count+ " ascessed by the object of subclass\n");
		
	}

}
