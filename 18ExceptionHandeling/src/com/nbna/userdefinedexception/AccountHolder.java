package com.nbna.userdefinedexception;

public class AccountHolder {
	
	static int withdrawAmount;
	
	public static void main(String args[]){
		
		BankAtm atm_day1 = new BankAtm();
		atm_day1.loginToAccount();
		atm_day1.depositMoney(1000);
		/*
		 * 1) To demo that once user defined exception extends Exception it will throw compile
		 * time exception 
		 */
		BankAtm atm_day2 = new BankAtm();
		//atm_day2.withdrawMoney(100);
		
		/*
		 * 2) To demo how user defined exception is handled. 
		 */
		BankAtm atm_day3 = new BankAtm();		
			int withdrawAmount =1500;
			try {
				atm_day3.withdrawMoney(withdrawAmount);
			} catch (EnoughFundsNotAvailabe e) {
				System.out.println("Sorry you can not withdraw: " + withdrawAmount+ "" +
						" since you are low on your balance which is: "+ atm_day3.getCheckingbalance());
			} catch (Exception e){
				System.out.println("In exception");
			}
		
	}

}
//System.out.println("Sorry you can not withdraw: " + withdrawAmount+ "" +
//		" since you are low on your balance which is: "+ atm_day3.getCheckingbalance());