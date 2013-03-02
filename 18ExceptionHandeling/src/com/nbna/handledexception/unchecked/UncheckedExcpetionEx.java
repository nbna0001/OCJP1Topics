package com.nbna.handledexception.unchecked;

public class UncheckedExcpetionEx {

	/*
	 * 1) To demo how to handle exceptions which fall under 
	 * 		the category of Unchecked Exceptions.
	 */
	public static void main(String[] args) {
		

		try {
			int a =0;
			int b =10;
			int c=0;
			int bdividebya = b/a;
		}
		
		 /* 2)To demo what is the default behaviour of exceptions
		 * 3)Quiz: To demo what would happen if the ArithmetiException and Exception are interchange. 
		 */
		/*catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("An Arithmetic Exception occured because you tried to divide a number by 0");
		}*/
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Sorry for the inconvinence. Please contact Customer support at 1-800-336-4876 ");
		}
		
		System.out.println("Hello");
		
	}

}
