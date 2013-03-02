package com.nbna.initializationexample;

public class MethodInitialization {

	int i =10;
	/*
	 * To demo how m1 executes before even initializing one 
	 * of its variables which is K in this case.
	 */
	int j= m3();    
	int k=10;
	
	/*public int m1(){
		return i+k;
	}*/
	/*
	 * To demo the difference when checked 
	 * are thrown 
	 */
	public int m2() throws Exception {
		return 30;
	}
	/*
	 * To demo the difference when unchecked exception is thrown 
	 */
	public static int m3() {
		return 10/0;
	}
	
	public static void main(String[] args) {	
				
		MethodInitialization fi = new MethodInitialization();
		System.out.println("Value of j: " + fi.j);
		
	}

}
