package com.nbna.question5;

public class Camel extends Dog implements Rideable {
	int weight = 2;

	public static void main(String[] args) {
		new Camel().go(8);
	}

	void go(int speed) {
		++speed;
		weight++;
		int walkrate = speed * weight;
		System.out.print(walkrate + getGait());
	}
	public String getGait() {
		return " mph, lope";
	}
	
	public void bark(){
		
		System.out.println("Moooo");
	}
}
