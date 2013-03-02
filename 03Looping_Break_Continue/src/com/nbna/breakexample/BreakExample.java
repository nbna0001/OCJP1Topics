package com.nbna.breakexample;

public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		// TODO Auto-generated method stub
		/*
		 * 1) To Demo usage of simple break statement
		 */
		System.out.println("\n Entering for loop");

		for (int j = 5; j > 0; j--) {

			System.out.println("\n"+j);

			System.out.println("Entering the 2nd loop");

			for (int k = 100; k < 500; k += 100) {
								
				if (k == 300) break;
					System.out.println(k);
			}
		}

		/*
		 * 2) To Demo usage of break with a label
		 */
		/*System.out.println("\n Entering for loop");
		lp1: for (int j = 5; j > 0; j--) {

			System.out.println(j);

			System.out.println("Entering the 2nd loop");

			lp2: for (int k = 100; k < 500; k += 100) {				
				if (k == 300)
					break lp1; 
					System.out.println(k);
				
			}
		}*/

		/*
		 * 3) To Demo how exactly break statement predicts where to break to
		 */
		int a = 5;
		while (a < 10) {
			System.out.println(a);
			if (a == 7) { //1st if condition
				if (a < 100) { //2nd if condition
					if (a <= 1000) { //3rd if condition
						break;
					} System.out.println("This is the end of 3nd if condition");
				} System.out.println("This is the end of 2nd if condition");
			} System.out.println("This is the end of 1st if condition");			
			a++;
		} //End of while loop
		
		
		/**
		 * 4) what happens if you make the a<=1000 to a==1000 above
		 * 5) what happens if I replace break in line 55 with break; System.out.println("I am beside break"); 
		 */
		
	}

}
