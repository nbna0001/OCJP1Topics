package com.nbna.userdefinedexception;

class BankAtm {

	static private int checkingbalance;
	
	public int getCheckingbalance() {
		return checkingbalance;
	}
	public void setCheckingbalance(int checkingbalance) {
		this.checkingbalance = checkingbalance;
	}
	
	public void loginToAccount(){
		System.out.println("Sucessfully loged in");		
	}
	
	public void depositMoney(int money){
		checkingbalance = money; 
		System.out.println("Thanks for the current deposit. Your current balance is: "+ checkingbalance);
	}
	public void withdrawMoney(int withdrawamount) throws EnoughFundsNotAvailabe{
		
		if (checkingbalance >0 && checkingbalance-withdrawamount >=0){		
			checkingbalance = checkingbalance- withdrawamount;
			System.out.println("Your current balance is: "+ checkingbalance);			
		}
		else {
			throw new EnoughFundsNotAvailabe();			
		}
	}
}
