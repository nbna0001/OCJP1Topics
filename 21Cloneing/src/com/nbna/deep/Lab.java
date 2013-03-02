package com.nbna.deep;

import java.util.ArrayList;
import java.util.List;

public class Lab {

	
	public static void main(String[] args) {
		Robo r1= new Robo();
		
		r1.id=1234;
		r1.bodyparts=25;
		
		Brain b = new Brain();
		b.afraid_of_war = true;
		
		r1.brain=b;
		
		
		Robo r2;
		try {
			r2 = (Robo) r1.clone();
			
			System.out.println("Robo r1's id: "+r1.id);
			System.out.println("Robo r2's id: "+r2.id);
			
			System.out.println("\nNo of body part on r1: "+r1.bodyparts);
			System.out.println("No of body part on r2: "+r2.bodyparts);
			
			System.out.println("\nIs r1 afraid of war: "+ r1.brain.afraid_of_war);
			System.out.println("Is r1 afraid of war: "+ r2.brain.afraid_of_war);
			
				
			
		} catch (CloneNotSupportedException e) {
			System.out.println("A CloneNotSupportedException occured");
		}
		
		
		

	}

}
