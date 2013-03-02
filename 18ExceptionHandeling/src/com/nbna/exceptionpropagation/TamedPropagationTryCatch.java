package com.nbna.exceptionpropagation;

public class TamedPropagationTryCatch{

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
		int i=10; 
		int j=0;
		
		try {
			int result = i/j;
		} catch (Exception e) {
			
			e.printStackTrace();
			//System.out.println("This is catch in m4");
		}
		
		System.out.println("This is m4 after executing i/j");
	}
	
	public static void main(String[] args) {
		TamedPropagationTryCatch u = new TamedPropagationTryCatch();
		try {
			u.m1();
		} catch (ArithmeticException ae) {
			System.out.println("AE caught");
		} catch(Exception e){
			System.out.println("Exception caught");
		}	
		System.out.println("Returned from m1, notice the difference");
	}

}
