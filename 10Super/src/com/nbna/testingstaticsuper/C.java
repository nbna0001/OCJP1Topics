package com.nbna.testingstaticsuper;

public class C extends B{
	static {
		System.out.println("This is the static block of class C");
	}

	public C() {		
		System.out.println("This is a constructor of C");
	}
	
	public C(int i){
		System.out.println("This is a constructor in C which takes int");
	}

}
