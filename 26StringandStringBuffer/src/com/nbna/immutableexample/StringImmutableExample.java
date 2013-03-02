package com.nbna.immutableexample;

public class StringImmutableExample {

	public static void main(String[] args) {
		/*
		 * 1)Why are we calling strings immutable
		 */
		String s1 = "Hello";
		String s2 = "World";
		s1 = s1+ s2; 
		System.out.println("The value of s1 is: "+ s1);
		
		
		/*
		 * 2)To demo what immutable means
		 */
		String s = "Let’s test";
		s.concat("if the String object is IMMUTABLE");
		System.out.println(s);
		
		/*
		 * 3)To demo what immutable is not
		 */
		s = s.concat("if the String object is IMMUTABLE");
		System.out.println(s);

	}

}

