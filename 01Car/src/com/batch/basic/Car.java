package com.batch.basic;

public class Car {
	
	String vehiclemodel;
	String vehiclemake;
	int numofwheelsw =4;
	int numofseats;
	int numofdoors;
	boolean musicplayerpresent;
	
	public Car(){
		vehiclemodel = "default";
		vehiclemake = "default";
		//numofwheels = 4;
		numofseats = 4;
		numofdoors = 4;
		
		System.out.println("Hello world");
			}
	
	 
	
	public void Car(){
		
		
	}
	public void printnumofwheels(){
		
		System.out.println(numofwheelsw);
	}
	public void driverCar() {
		System.out.println("Drive Car");
	}
	public void startCar() {
		System.out.println("Start Car");
	}
	public void stopCar() {
		System.out.println("Stop Car");
	}
	
	public void setNumberOfDoors(int numberofdoors){		
		this.numofdoors = numberofdoors;
	}

	public int adjustSeat(int button) {
		if (button == 1) {
			System.out.println("Seat set to 1");
			return 1;
		} else if (button == 2) {
			System.out.println("Seat set to 2");
			return 2;
		}
		System.out.println("Seat set to custom adjustment");
		return 0;
	}

	public String openDoor() {
		String sound = "click";
		return sound;
	}

	public String lockDoor() {
		String sound = "click click";
		return sound;
	}

	public void playMusic() {
		System.out.println("Play Music");
	}

	public void stopMusic() {
		System.out.println("Stop Music");

	}
}


