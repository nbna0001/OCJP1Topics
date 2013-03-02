package com.nbna.testingstaticsuper;

public class D extends C{

	static {
		System.out.println("This is the static block of class D");
	}

	
	public D() {
		super();
		System.out.println("This is a constructor of D");
		this.sayHello();
		//super();
	}

	public void sayHello(){
		System.out.println("Hello");
	}
}
