package com.nbna.exceptionpropagation;

public class UntamedPropagation {

	public void m1(){
		m2();
		System.out.println("This is m1");
		
	}
	public void m2(){
		m3();
		System.out.println("This is m2");
		
	}
	public void m3(){
		m4 ();
		System.out.println("This is m3");
				
	}
	public void m4() {
		System.out.println("This is m4 before executing i/j");
		int i=10; 
		int j=0;
		int result = i/j;
		System.out.println("This is m4 after executing i/j");
	}
	
	public static void main(String[] args) {
		UntamedPropagation u = new UntamedPropagation();
		u.m1();		
		System.out.println("Returned from m1. This will not get printed");
	}

}
