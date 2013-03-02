package com.nbna.hashcode;

public class Test {

	public static void main(String[] args) {
		
		Car c = new Car(123456,8,"Toyota");
		Car c1 = new Car(678832,10,"Nissan");
		String s = "sai";
		System.out.println(s);
		//c=c1;
		
		/*
		 * 1)To demo the hascode for each object
		 */
		/*System.out.println("Code of c: "+ c.hashCode());
		System.out.println("Code of c1: "+ c1.hashCode());
		*/
		/*
		 * 2)To demo how toString method works for all objects
		 */
		/*System.out.println("ToString of c: "+ c.toString());
		System.out.println("ToString of c1:"+ c1.toString());*/
		
		/*
		 * 3) To demo that even if you do not explicitly 
		 */
		/*System.out.println("Value of c: "+ c);
		System.out.println("Value of c1: "+ c1);*/
		
		
	}

}
