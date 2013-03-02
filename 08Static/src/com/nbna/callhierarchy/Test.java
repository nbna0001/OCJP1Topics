package com.nbna.callhierarchy;

public class Test {
	/*
	 * 2) To Demo the effect of not Test not inheriting any class vs inheriting
	 * ScCal or Cal. Explain by taking out the inner part of Main.
	 */
	static{
		System.out.println("static main");
	}	

	public static void main(String[] args) {
		/*
		 * 1) To demo the call heriarcy
		 */
		ScCal sccal = new ScCal();
		/*sccal.add();
		sccal.multiply();*/
		
	}
}
