
public class NarrowingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		/* 
		 * To demo that the use of final to tell the complier 
		 * the value is the variable is with in the range
		 */
		 byte s=(2^16)+1;
		 final int i =10;
		 		 
		 s= i;
				
		 
		 System.out.println(s);
		 		 
		 
	}

}
