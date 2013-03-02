package com.nbna.assertexample;

public class AssretUsage {

	public static void main(String[] args) {
		
		int a,b,result;
		a =10;
		b=6;
		result = a+b;
		/*
		 * To demo syntax of assertion
		 * To demo actual usage of assertions 
		 * To demo how this is used with -ea
		 */
		assert result==15: "Something wrong because a is: "+ result;
		System.out.println("The value of result is:"+ result);
	}

}
