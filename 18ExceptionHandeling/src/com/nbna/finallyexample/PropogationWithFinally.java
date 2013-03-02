package com.nbna.finallyexample;

import com.nbna.exceptionpropagation.TamedPropagationTryCatch;

public class PropogationWithFinally {

	public void m1(){
		System.out.println("This is m1");		
		m2();
	}
	public void m2(){
		System.out.println("This is m2");
		m3();
	}
	public void m3(){
		System.out.println("This is m3");
		m4 ();		
	}
	public void m4() {
		System.out.println("This is m4 before executing i/j");
		/*
		 * To demo that the finally block will be executed before propagation the error
		 * message
		 */
		try {
			int i=10; 
			int j=0;
			int result = i/j;
			System.out.println("This is try block in m4");
		} 
		finally {
			System.out.println("This is the finally in m4");
		}
		System.out.println("This is m4 after executing i/j");
	}
	
	
	
	public static void main(String[] args) {
		PropogationWithFinally u = new PropogationWithFinally();
		try {
			u.m1();
		} catch (ArithmeticException ae) {
			System.out.println("AE caught");
		} catch(Exception e){
			System.out.println("Exception caught");
		} finally {
			System.out.println("This is the finally block in main");
		}
		
	}

}
