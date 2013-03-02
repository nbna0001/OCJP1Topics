package com.nbna.testingstaticsuper;

public class B extends A{
	
	public B() {
		System.out.println("This is constructor of class B");
		//add();
		//super.add();
	}
	
	public void add(){
		System.out.println("This is a add method in Class B");
	}
	
	static {
		System.out.println("This is the static block of class B");
	}
}
