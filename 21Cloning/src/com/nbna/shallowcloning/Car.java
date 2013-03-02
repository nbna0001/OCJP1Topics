package com.nbna.shallowcloning;
/*
 * To demo that Cloneable does not have the method called clone
 */
public class Car implements Cloneable{

	private String Make;
	
	private ParkingAddress address; 
	
	public ParkingAddress getAddress() {
		return address;
	}
	public void setAddress(ParkingAddress address) {
		this.address = address;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	
	
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}

}
