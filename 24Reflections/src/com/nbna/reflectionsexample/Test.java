package com.nbna.reflectionsexample;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		
		Car c = new Car();
		/*
		 * 1)Note that Class is a class in java which extends object class
		 * 2)Cl is an object 
		 */
		Class cl = c.getClass();
		System.out.println("Class name: "+ cl);
		
		
		Method m[] = cl.getMethods();
		
		for(int i=0; i<m.length; i++){			
			System.out.println("m"+ i+" "+m[i].getName());
		}

	}

}
