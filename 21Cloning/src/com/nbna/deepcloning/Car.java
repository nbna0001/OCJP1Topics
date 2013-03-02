package com.nbna.deepcloning;
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
		
		/*
		 * Note that an object of the class is first created. Aslo note that we are performing a shallow cloning 
		 * to create this object car_clone. 
		 */		
		Car car_clone = (Car)super.clone();
		
		/*
		 * Once the shallow clone is created we will modify this clone in such a way
		 * deep clone is achieved. 
		 * Note Deep cloning is required only when you have non permeative types as feild variable
		 */
		
		ParkingAddress parkingadd= new ParkingAddress();
		
		parkingadd.setZipcode(this.getAddress().getZipcode());
		
		car_clone.setAddress(parkingadd);		
		return car_clone;
	}

}
