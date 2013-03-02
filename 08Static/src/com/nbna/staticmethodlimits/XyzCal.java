package com.nbna.staticmethodlimits;

public class XyzCal extends Cal {
	int xyz_instance_variable = 10;
	
	static int xyz_staticvar =20;
	
	
	String sum() {
		return "Xyz Sum";
	}

	static String difference() {

		return "Xyz Difference";
	}

	void  product() { //This is a non static method of XyzCal
		/*
		//1) To Demo that non static variables can be accessed in non static methods of the class		
		System.out.println("The value of xyz_instance_variable is: "+ xyz_instance_variable);
		
		//2) To Demo that non Static methods can be accessed in a non static methods
		System.out.println("The value returned by sum is: "+sum());
		
		//3) To Demo that static variables can be accessed in a non static methods of the class
		System.out.println("The value of xyz_staticvar isL "+ xyz_staticvar);
		
		// 4) To Demo that static methods can be accessed in a non static methods of the class
		System.out.println("The value returned by difference is: "+ difference());	
		
		// 5) To Demo that the non static variable of current class CANNOT be accessed by name of the class itself
		System.out.println("The value of xyz_staticvar isL "+ XyzCal.xyz_instance_variable);
				
		// 6) To Demo that the non static method of current class CANNOT be accessed by name of the class itself
		System.out.println("The value returned by difference is: "+ XyzCal.sum());		
		
				
		// 7) To Demo that the word this can be used to access the non static variable of the current class in non static method 
		System.out.println("The value of xyz_instance_variable when accessed using this key word is: "+ this.xyz_instance_variable);
		
		//8) To Demo that the word this can be used to used to access the non static method of the current class in non static method of this class
		System.out.println("The value retruned by sum when accessed using this key word is: " + this.sum());
		
		//9) To Demo that the word this can be used to access the static variable of the current class
		System.out.println("The value of xyz_staticvar isL "+ this.xyz_staticvar);
		
		// 10) To Demo that the word this can be used to access the static methods of the current class
		System.out.println("The value returned by difference is: "+ this.difference());
		
		// 11) To Demo that the static variable of current class can be accessed by name of the class itself
		System.out.println("The value of xyz_staticvar isL "+ XyzCal.xyz_staticvar);
		
		// 12) To Demo that the static method of current class can be accessed by name of the class itself
		System.out.println("The value returned by difference is: "+ XyzCal.difference());
		
		//The below 4 are related to accessing the parent class methods and variables. 
		//13) To Demo that the word Super can be used to access the variable of the parent class in non static method of this class
		System.out.println("The value of cal_variable: "+ super.cal_variable);
		
		//14) To Demo that the word Super can be used to access the method of the parent class in non static method of this class
		System.out.println("The value returned by add when accessed using Super key word is: "+ super.add());
		
		// 15) To Demo that the static variable of parent class can be accessed by name of the  parent class itself in a non static method
		System.out.println("The value of xyz_staticvar isL "+ Cal.cal_staticvar);
				
		// 16) To Demo that the static method of parent class can be accessed by name of the parent class itself in a non static method
		System.out.println("The value returned by difference is: "+ Cal.multiply());
		*/
		
	}

	static void divide() {
		       /*//1) To Demo that non static variables CANNOT be accessed in static methods of the class		
				System.out.println("The value of xyz_instance_variable is: "+ xyz_instance_variable);
				
				//2) To Demo that non Static methods CANNOT be accessed in a static methods
				System.out.println("The value returned by sum is: "+sum());
				
				//3) To Demo that static variables can be accessed in a static methods of the class
				System.out.println("The value of xyz_staticvar isL "+ xyz_staticvar);
				
				// 4) To Demo that static methods can be accessed in a static methods of the class
				System.out.println("The value returned by difference is: "+ difference());	
		
				// 5) To Demo that the non static variable of current class CANNOT be accessed by name of the class itself in static method
				System.out.println("The value of xyz_staticvar isL "+ XyzCal.xyz_instance_variable);
						
				// 6) To Demo that the non static method of current class CANNOT be accessed by name of the class itself in static method
				System.out.println("The value returned by difference is: "+ XyzCal.sum());		
				
				
				// 5) To Demo that the word this CANNOT be used to access the non static variable of the current class in static method 
				System.out.println("The value of xyz_instance_variable when accessed using this key word is: "+ this.xyz_instance_variable);
				
				//6) To Demo that the word this CANNOT be used to used to access the non static method of the current class in static method of this class
				System.out.println("The value retruned by sum when accessed using this key word is: " + this.sum());
				
				//7) To Demo that the word this CANNOT be used to access the static variable of the current class in static method of this class
				System.out.println("The value of xyz_staticvar isL "+ this.xyz_staticvar);
				
				// 8) To Demo that the word this CANNOT be used to access the static methods of the current class in static method of this class
				System.out.println("The value returned by difference is: "+ this.difference());
				
				// 9) To Demo that the static variable of current class can be accessed by name of the class itself in static method of this class
				System.out.println("The value of xyz_staticvar isL "+ XyzCal.xyz_staticvar);
				
				// 10) To Demo that the static method of current class can be accessed by name of the class itself in static method of this class
				System.out.println("The value returned by difference is: "+ XyzCal.difference());
												
				//The below 4 are related to accessing the parent class methods and variables. 
				//11) To Demo that the word Super CANNOT be used to access the variable of the parent class in static method of this class
				System.out.println("The value of cal_variable: "+ super.cal_variable);
				
				//12) To Demo that the word Super CANNOT be used to access the method of the parent class in static method of this class
				System.out.println("The value returned by add when accessed using Super key word is: "+ super.add());
				
				// 13) To Demo that the static variable of parent class can be accessed by name of the  parent class itself in a static method
				System.out.println("The value of xyz_staticvar isL "+ XyzCal.cal_staticvar);
						
				// 14) To Demo that the static method of parent class can be accessed by name of the parent class itself in a static method
				System.out.println("The value returned by difference is: "+ Cal.multiply());*/
								
	}

}
