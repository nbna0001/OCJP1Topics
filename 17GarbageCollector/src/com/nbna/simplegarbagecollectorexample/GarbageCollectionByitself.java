package com.nbna.simplegarbagecollectorexample;

public class GarbageCollectionByitself {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BulkyObject ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		System.gc();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();
		ob = new BulkyObject();		
		
	}

}
