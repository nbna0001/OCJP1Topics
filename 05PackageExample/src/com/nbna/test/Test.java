package com.nbna.test;

 //import com.nbna.cal.*;
 //import com.nbna.othercal.*; (4)

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cal c= new Cal();// (1)
		
		int i=1; 
		int j=3;
		
		//int result =c.add(i,j); //(2)		
		//System.out.println("Result is:"+ result);
		
		//int s = c.sum; //(3)
	}

}

/**
 *1) Why is (1) throwing an error?
 * Steps to fix the issue:
 * 	~Import Calculator
 * 	~Make the Calculator public
 * 
 * 2) Why is (2) throwing an error?
 * Steps to fix the issue: 
 * 	~Make the add as public
 * 
 * 3) What is the danger of declaring sum as public?
 * 	It does not let evolution to take place.
 * 
 * 4) What happens if I uncomment the line 4? Notice that I have two
 * classes with same name in different package
 */
