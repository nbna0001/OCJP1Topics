package com.nbna.unhandledexception;

public class PesimesticCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =0;
		int b =10;
		int c=0;
		
		try {
			int bdividebya = b/a;
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		try {
			int adividebyb = a/b;
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		try {
			int cdividebya = c/a;
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		

	}

}
