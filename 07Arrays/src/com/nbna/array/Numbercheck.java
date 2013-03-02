package com.nbna.array;

//This is the second programme in arrays

public class Numbercheck {

	public Numbercheck() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		 boolean foundcheckdigit=false;
		 
		 int[] intArray = new int[] {100,2,-3,45,5,6,7,80,99,0,0,1,01,101,1010,1,01,101,01,1,100101,1010100101,911,9080};
		 int foundlocation=0;
		 
		 for (int i=0; i<intArray.length; i++){		
				if (intArray[i]==45){	
					
					foundcheckdigit =true;
					foundlocation= i;
					break;
				}
		 }
				
		 	if(foundcheckdigit)
			System.out.println("Found check digit at: "+ foundlocation);
		 	else
		 		System.out.println("String not found");
			
		 
	 }

}
