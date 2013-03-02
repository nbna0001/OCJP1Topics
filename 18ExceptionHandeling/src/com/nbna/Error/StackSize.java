package com.nbna.Error;

public class StackSize {
	static int stacksize;
	
	StackSize(){
		++stacksize;
		StackSize sz = new StackSize();			
	}
}
