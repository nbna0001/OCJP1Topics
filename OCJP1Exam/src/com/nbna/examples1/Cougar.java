package com.nbna.examples1;

public class Cougar extends Feline {
	//String type ="c ";
	public Cougar() {
		System.out.print("cougar ");
	}

	public static void main(String[] args) {
		new Cougar().go();
	}

	void go() {
		//String type ="c ";
		type = "c ";
		System.out.print(this.type + super.type);
	}
}

