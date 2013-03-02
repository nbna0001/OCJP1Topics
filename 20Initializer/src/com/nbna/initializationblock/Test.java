package com.nbna.initializationblock;

public class Test {
	{System.out.println("This is the instance initializer in Test ");}

	static{
		System.out.println("This is static of Test");
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();		
		/*A a2 = new A(10);
		A a3 = new A(10,20); 
		A a4 = new A(10,20,30);*/
	}

}
