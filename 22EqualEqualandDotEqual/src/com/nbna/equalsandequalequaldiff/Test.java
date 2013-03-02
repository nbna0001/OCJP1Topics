package com.nbna.equalsandequalequaldiff;

public class Test {

	
	public static void main(String[] args) {
		
		Car c = new Car(123456789, 4);
		Car c1 = new Car(123456789, 4);
		c.add();
		
		if (c==c1){
			System.out.println("C and C1 are equal this is from c==c1");
		}
		else if (c.equals(c1)){ // c reffers to this and c1 local object in the equals method
			System.out.println("C and C1 are equal");
		}
		else 
			System.out.println("C and C1 are not equal");
				
	}
	
	
}
