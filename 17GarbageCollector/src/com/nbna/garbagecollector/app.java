package com.nbna.garbagecollector;

public class app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Data d = new Data();
		
		//Some code..
		
		d= null; 
		/*But a above statement does not mean that GC will get called
		 * GC will get called when JVM thinks it is running out of 
		 * heap memory
		 */
		
		//some additional code. 

	}

}
