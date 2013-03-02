package com.nbna.immutableexample;

public class StringBufferMutability {

	public static void main(String[] args) {
		/*
		 *To demo how the same operation is performed using StringBuffer 
		 */
		StringBuffer s = new StringBuffer("Let’s test");
		s.append(" if the String object is IMMUTABLE");
		System.out.println(s);
			}

}
