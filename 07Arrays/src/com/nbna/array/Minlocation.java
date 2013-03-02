package com.nbna.array;

public class Minlocation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] intArray = new int[] {100,2,-3,44,5,6,7,80,99,0};
		
		int minValue=0, minlocation=0;
					
		for (int i=0; i<intArray.length; i++){	
			if (minValue> intArray[i]){				
				minValue  = intArray[i];
				minlocation= i;
			}
		}
			
		System.out.println("Mimum value is: "+ minValue +" and is located at: "+ minlocation);		
		
	}

}
