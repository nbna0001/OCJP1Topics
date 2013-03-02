package com.nbna.finalexample;

/*
 *2) To demo final class extend ScCal
 */
public class XyzCal extends Cal {
	
	
	int a =5;
	/*
	 * 3) To demo keyword final's effect on variable
	 * 
	 */
	XyzCal(){
	 //super.a= 5;	
	}
	 
	void divide(){
		//super.a=8;
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("The value of variable a is:"+ super.a );
	}
	
	/*
	 * To Demo that super and this can not be used in static context
	 */
	/*static void modulo(){		
		System.out.println("The value of variable a is:" + super.a);
	}
	*/
	public static void main(String args[]){
		
		XyzCal xyz = new XyzCal();
		xyz.divide();
		
	}
	}
