package com.nbna.handledexception.Checked;

public class CheckedExceptionTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			System.out.println("Before sleeping");
			Thread.sleep(10000);
			System.out.println("After sleeping");
		}		
		catch (InterruptedException ie) {
			
			System.out.println("An InterruptedException has occured. Please call help desk 1-800 -234-4342"); 
		}
		catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Sorry for the inconvinence. Please contact Customer support at 1-800-336-4876 ");
		}
		
		
	}

}
