package com.nbna.exceptionpropagation;


public class TamedPropagationThrows {

	public void m1() throws InterruptedException{
		System.out.println("This is m1");		
		m2();
	}
	public void m2() throws InterruptedException{
		System.out.println("This is m2");
		m3();
	}
	public void m3() throws InterruptedException{
		System.out.println("This is m3");
		m4 ();		
	}
	private void m4() throws InterruptedException {
		System.out.println("This is m4 before executing sleep");		
		Thread.sleep(1000);				
		System.out.println("This is m4 after executing sleep");
	}
	
	public static void main(String[] args) throws InterruptedException {
		TamedPropagationThrows u = new TamedPropagationThrows();
			/*
			 * To Demo how system compliants if you try to use a method which states 
			 * that it will throw errors
			 */
			u.m1();		
		System.out.println("Returned from m1, notice the difference");
	}

}
