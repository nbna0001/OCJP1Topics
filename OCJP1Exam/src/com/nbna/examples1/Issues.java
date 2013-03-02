package com.nbna.examples1;

public class Issues {
	public static void main(String[] args) {
		try {
			doStuff();
		} catch (Exception e) {
			System.out.print("catch block ");
		} finally {
			System.out.print("finally block ");
		}
	}

	static void doStuff() {
		throw new Error();
	}
}
