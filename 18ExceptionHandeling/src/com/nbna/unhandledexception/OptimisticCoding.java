package com.nbna.unhandledexception;

public class OptimisticCoding {

	
	public static void main(String[] args) {
		
		/*
		 * To Demo how optimistic coding will fail to work
		 * Optimist is a person who thinks world will run smoothly
		 * even if he does what ever he is doing and does not have 
		 * to think of negative possiblities.
		 */
		
		int a = 0;
		int b= 10;
		
		int aplusb = a+b;
		System.out.println("Value of aplusb: "+aplusb);
		int aminusb = a-b;
		System.out.println("Value of aminusb: "+ aminusb);
		
		/*
		 * To Demo Arithmetic Exception
		 */
		int bdividebya = b/a;		
		System.out.println("Value of bdividebya: " + bdividebya);
		
		/**
		 * The following is what is happening at line 26:
		 * 	System encounters a incident which is called an exception, it will decide not to proceed further
		 * 	It realizes that it understand this exception.  
		 *  JVM searches for a Class and creates an instance of this class
		 *  When creating an object of the class it initializes the values of the object with details like line number, call hirearhy etc
		 *  If there is an exception handling block then it will pass this object to the handler methods in a gracefull manner 
		 *  Else it will ungracefully throw this error to the system console, because you did not tell it what to do. 
		 *  This is considered to be abrupt way of exiting from the code because developer may understand the exception but think of the fate
		 *   of a lay man who does not know what is a program
		 *  That is why we need exception handler to tell the end user what happened at line 20.
		 */
		
		System.out.println("I have performed all requested actions");
	}

}
