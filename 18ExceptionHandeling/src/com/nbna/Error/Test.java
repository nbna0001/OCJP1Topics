package com.nbna.Error;

public class Test {

	
	public static void main(String[] args) {
		
		try {
			StackSize sz = new StackSize();
		}
		catch (Exception e) {
			System.out.println(StackSize.stacksize);			
		}
		finally {
			System.out.println("The size of stack found in "+StackSize.stacksize*32 +" Bytes");
		}

	}

}
