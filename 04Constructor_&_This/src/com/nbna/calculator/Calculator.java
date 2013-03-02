package com.nbna.calculator;

public class Calculator {
	
	int i = 1/2; 
	int a;
	int b;

	public Calculator() {
		// TODO Auto-generated constructor stub
		System.out.println("Cal is at your service");
		System.out.println("Calculator defalut value is: "+ i+"\n");
		
	}
	
	
	public Calculator(String saysomething){		
		System.out.println("Cal is busy " + saysomething);				
	}
	
	
	public Calculator(int a, int other){		
		
		this.a = a; // left hand side is a state variable and right hand side is a parameter. 
		b= other;
		
		System.out.println("The value of 'a' inside the scope of Calculator constuructor is :" + a );	
		System.out.println("The value of 'b' inside the scope of Calculator constuructor is:" + b + "\n");
		
	}
	
	 void addFunction(){
		
		 System.out.println("This is a add method in Caluclator");
	}

}
