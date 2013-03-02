package com.nbna.clone;

import java.util.ArrayList;
import java.util.List;

public class Lab {

	
	public static void main(String[] args) {
		Robo r1= new Robo();
		
		r1.id=1234;
		r1.bodyparts=25;
		
		
		Robo r2;
		try {
			r2 = (Robo) r1.clone();
			
			/*
			 * To demo that addresses and hashcodes are different for clone and original
			 */
			System.out.println("The value of r1 is: "+r1);
			System.out.println("The value of r2 is: "+r2);
			
			System.out.println("The value of r1's hashcode: "+r1.hashCode());
			System.out.println("The value of r2's hashcode: "+r2.hashCode());
			
			/*
			 * To demo that the values of the objects are same 
			 * which is what a clone should do. 
			 */
			System.out.println("Robo r1's id: "+r1.id);
			System.out.println("Robo r2's id: "+r2.id);
			System.out.println("No of body part on r1: "+r1.bodyparts);
			System.out.println("No of body part on r2: "+r2.bodyparts);
		} catch (CloneNotSupportedException e) {
			System.out.println("A CloneNotSupportedException occured");
		}
		
		
		

	}

}
