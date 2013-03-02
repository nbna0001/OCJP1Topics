package com.nbna.circularreference;

public class b {
	a a1;
	
	b(){
		a1 = new a();
		System.out.println("This is a constructor of b");
	}

}
