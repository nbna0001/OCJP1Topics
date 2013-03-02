
public class SelectionStatements {
	
	public static void main (String args[]){
		
		int a =5;
		
		
		/*
		 * To Demo unary increment operator and if logic.
		 */
		if (a++ == 5){			
			System.out.println("The value of a is: " + a);
		}
		
		/*
		 * To Demo unary decrement operator and if-else nested logic.
		 */
		
		int b = 10;
		
		if (--b == 10){			 
			System.out.println("The value of --b is: " + b);
		} else if (b++ == 10){
			
			System.out.println("The value of b++ is: " + b);			
		}else
			System.out.println("The value of b is: "+ b);
					
		/*
		 * To Demo dynamic initialization, Ternary operator and switch logic
		 */
		 
		char ch = 10<11?'a':'d';
		
		switch(ch){		
		 
		case 'a': System.out.println("a \n");
		case 'b': System.out.println("b \n");
		case 'c': System.out.println("c \n");
		case 'd': System.out.println("d \n");
		default : System.out.println("e \n");
		}
		
		
	}

}
