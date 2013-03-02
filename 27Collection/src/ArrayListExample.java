import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//List<Integer> numbers = new ArrayList<Integer>();
		//List<int> numbers = new ArrayList<i>();
		
		numbers.add(10);
		numbers.add(50);
		numbers.add(10);
		
		System.out.println(numbers);
		/*This will be very slow because
		 * it will try to move all the blocks left after removing 
		 * the block 
		 */
		numbers.remove(0);  

	}

}
