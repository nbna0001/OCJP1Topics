package com.nbna.clone;
/*
 * To demo that Cloneable does not have the method called clone
 */
public class Car implements Cloneable{

	private String Make;
	
	
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	
	/*
	 * NOTE: That the clone method is protected and returns Object because thats how it 
	 * is defined in Object class
	 */
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}

}
