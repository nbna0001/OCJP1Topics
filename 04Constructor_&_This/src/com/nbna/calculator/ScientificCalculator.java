package com.nbna.calculator;

public class ScientificCalculator extends Calculator{
	
	float f =  1.0f/2;

	public ScientificCalculator() {
		
		System.out.println("Scientific Cal is at your service");
		System.out.println("Scientific cal default is: "+ f +"\n");
		addFunction();
		this.addFunction();
		super.addFunction();			
	}
	
	 void addFunction(){
		
		System.out.println("This is a add method present in SCal");
	}

}
