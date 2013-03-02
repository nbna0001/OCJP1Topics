package com.nbna.roboticwife;

/*
 * To Demo how a class implements all the interfaces
 */
public class HumanoidStella implements Daughter, Professional, Mother, Wife {

	public HumanoidStella() {
		System.out.println("Hello world I am stella");
	}

	/*
	 * What happens if I take out public? 
	 * What happens if I change String to void?
	 */
	public String talkNiceWords() {
		return "How are you";
	}
	
		
	public String sharePersonalLife() {		
		return null;
	}	

	public void teachManners() {

	}

	public String cookFood() {
		return "Rice";
	}
	/*
	 * To Demo the improper attempt of method overloading
	 */
	//public int cookFood(){
	//	return "0";
	//}
	
	public String writeCode() {
		return null;
	}

	public String attendMeetings() {
		return null;
	}

	public static void main(String[] args) {

		HumanoidStella stella = new HumanoidStella();
		//System.out.println(stella.talkNiceWords());

	}
	
}
