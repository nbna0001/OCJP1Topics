package com.nbna.simplegarbagecollectorexample;

public class GarbageCollectionWithgc {

	
	public static void main(String[] args) {
		
		BulkyObject ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();		
		System.gc();
		
	}

}
