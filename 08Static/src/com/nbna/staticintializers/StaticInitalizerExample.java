package com.nbna.staticintializers;

public class StaticInitalizerExample {

	public static void main(String[] args) {		
		System.out.println("Hello World");
	}
	/*
	 * To Demo that Static gets called before main gets called
	 */
	static {
		//System.out.println(i);
		System.out.println("Called before main");
	}
	
	/*
	 * To Demo that Static gets called in the order in which they 
	 * are written  
	 */
	static {
		int i;		
		System.out.println("Static 2");
		
	}
	
	static {
		System.out.println("Static 3");
	}
	
}
/**
 * What happens if I comment out main? Will my program run?
 */
