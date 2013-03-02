package com.nbna.continueexample;

public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) To Demo usage of simple continue statement
		 */
		/*System.out.println("\n Entering for loop");

		for (int j = 5; j > 0; j--) {

			System.out.println("\n"+j);

			System.out.println("Entering the 2nd loop");

			for (int k = 100; k < 500; k += 100) {
								
				if (k == 300) continue;
					System.out.println(k);
			}
		}*/

		/*
		 * 2) To Demo usage of continue with a label
		 */
		/*System.out.println("\n Entering for loop");
		lp1: for (int j = 5; j > 0; j--) {

			System.out.println(j);

			System.out.println("Entering the 2nd loop");

			lp2: for (int k = 100; k < 500; k += 100) {				
				if (k == 300)
					//continue lp1;
					break;
					System.out.println(k);
				
			}
		}*/

		/*
		 * 3) To Demo basic difference between while and for loop and also to demo the diff
		 * beteween break and continue.
		 */
		
		int b=5;
		while (b<10){
			System.out.println(b);			
			if(b<100)
			continue;
			b++;
		}
		
		/**
		 * 4) how to avoid the above infinate loop
		 * 
		 */
		
	}

}
