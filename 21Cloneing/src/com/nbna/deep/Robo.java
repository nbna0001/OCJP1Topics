package com.nbna.deep;



public class Robo implements Cloneable{
	
	int id;
	int bodyparts;
	Brain brain; 
	
	/*protected Object clone() throws CloneNotSupportedException{
		Robo r =  (Robo) super.clone();
		return r;
	}*/
	
	protected Object clone() throws CloneNotSupportedException{
		
		/*
		 * Note that an object of the class is first created. Aslo note that we are performing a shallow cloning 
		 * to create this object robo_clone. 
		 */		
		Robo robo_clone = (Robo)super.clone();
		
		/*
		 * Once the shallow clone is created we will modify this clone in such a way
		 * deep clone is achieved. 
		 * Note Deep cloning is required only when you have non permeative types as feild variable
		 */
		
		Brain br= new Brain();		
		br.afraid_of_war = false;		
		robo_clone.brain =br;	
		return robo_clone;
	}
	
	
}
