package com.nbna.initializationblock;

public class A {
	/*
	 * To demo that repetition of code in constructors can be avoided by
	 * using initance Initializer block
	 */
	{
		System.out.println("You have instantiation A");
	}

	A(){
		
		System.out.println("This is a no parameter constructor of A");
	}
	
	A(int a){
		
		System.out.println("This is a single parameter constructor of A");
	}
	
	A(int a, int b){
		
		System.out.println("This is a two parameter constructor of A");
	}
	
	A(int a, int b, int c){
		
		System.out.println("This is a three parameter constructor of A");
	}
	
	static{
		System.out.println("This is a static in A block");
	}
}
