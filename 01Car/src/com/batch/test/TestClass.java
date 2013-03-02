package com.batch.test;

import com.batch.basic.Car;
import com.batch.basic.Toyota;

public class TestClass {

	

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Car c2,c1;
		
		//c = new Car();
		//c1 = new Car();
		Toyota t1 = new Toyota();
		String s1 = "wel";
		String s2= "come";
		String s = s1+ s2;
		int a =18;
		int b = 7;
		int c= 10;
		
		int d = c++;
		System.out.println("value of d in 1: "+d);
		System.out.println("value of c in 2: " +c);
		int e = ++c;
		System.out.println("value of d in 3: "+e);
		System.out.println("value of c in 4: "+c);
		
		c++;
		System.out.println("value of c in 5: "+c);
		c++;
		System.out.println("value of c in 6: "+c);
		
		System.out.println("value of c in 7: "+ c++);
		System.out.println("value of c in 8: "+ (++c));
		
		boolean bol1 = true;
		boolean bol2 = false;
		boolean bol4 = false; 
		
	    boolean bol3 = bol1 & bol2 & bol4;
	    
	    byte i =-2;
	    byte j = 3;
	    
	    //byte k = i>>1;
	   // System.out.println(bol3);
		
	    System.out.println(i>>>1);
	    int x= 2;
		
	    bl:{
	    	 bl2:{
	    	
	    			bl3:{
	    			System.out.println("You are at block 3");
	    				if (x==2)break bl2; // Go to end of block 2; 
	    			}
	    	
	    	System.out.println("You are at block 2");	    	
	    }
	    	
	    	System.out.println("You are at block 1");
	   }
		
		
		
	}

}

