package com.nbna.inheritanceindepth;

public class Test {
	
	public static void main(String[] args) {
			Kitten kitty = new Kitten();
			kitty.add();
			kitty.multiply();			
			/*
			 * 1) Is the below assignment valid and what does 
			 * it mean.
			 */
			Cat cat =  kitty;	
			//Cat cat = new Kitten();
			//cat.add();
			
			
			/*
			 * 2)To demo that method which is part of child class
			 * can not be referenced by parent.Becuase at complie time
			 * the assignment of kitty = new Kitten() in line 6 does not take place yet.
			 * 
			 * 3)Add method multiply to cat and see the difference.    
			 */
			//cat.multiply();	
			
	}

}
