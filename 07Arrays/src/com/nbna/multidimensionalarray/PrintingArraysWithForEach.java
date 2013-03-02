package com.nbna.multidimensionalarray;

public class PrintingArraysWithForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Printing the value of 2 dimentional a: ");
		for (int i[] : a) {

			System.out.println();
			for (int j: i) {

				System.out.print(j + "\t");
			}
		}

	}

}
