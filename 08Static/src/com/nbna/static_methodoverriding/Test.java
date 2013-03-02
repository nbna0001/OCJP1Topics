package com.nbna.static_methodoverriding;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal = new Cal();
		Cal scal = new ScCal();
		
		/*cal.add();
		scal.add();
		*/
		
		cal.multiply();
		scal.multiply();

	}

}
