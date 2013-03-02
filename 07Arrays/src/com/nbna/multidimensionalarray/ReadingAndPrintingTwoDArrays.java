package com.nbna.multidimensionalarray;

// First program in Multi-dimensional array
public class ReadingAndPrintingTwoDArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Printing the value of 2 dimentional a: ");
		for (int i = 0; i < 3; i++) {

			System.out.println();
			for (int j = 0; j < 3; j++) {

				System.out.print(a[i][j] + "\t");
			}
		}

		int b[][] = new int[3][3];

		System.out.println("\n Writing the values to a 2 dimentional array b and printing it out");

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				b[i][j] = i + j;
				System.out.print(b[i][j] + "\t");
			}
		}
	}

}
