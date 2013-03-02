package com.nbna.finallyexample;

public class FinallyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		/*
		 * To Demo that finally will get called if try gets called 
		 * it does not matter if exception occurs or not
		 * it does not matter if catch exists or not
		 */
			try {
				System.out.println("This is the try blcok in main");
				int i =10;
				int j =0;
				int result= i/j;
				
			} 
			catch (ArithmeticException e) {				
				System.out.println("Caught Arthimetic Exception ");
			}
			finally {
				System.out.println("This is the Finally block in main");
			}
		
	}
		

}
