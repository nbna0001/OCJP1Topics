package com.nbna.scopeexample;

public class Class { //notice that class is a key word an Class is not
	
	int int1; //visible to all code in the class
	
	
	public void method( int int2)//visible to all code in this method
	{
		int int3  =3; //visible to all code in this method
		
			if (int1 !=int2){
				int int4 =4; //visible only in this code block
				
				System.out.println(int1);
				System.out.println(int2);
				System.out.println(int3);
				System.out.println(int4);
			}		
	}
	 void add (){
		 int j =5;
		// System.out.println(int4);
	 }
	
}
