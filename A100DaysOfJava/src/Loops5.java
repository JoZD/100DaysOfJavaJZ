import java.util.*;
public class Loops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//For loops 
		
		
		// For (Start of loop, condition, loop count)
		// Create a list and print each element with for loop 
		
		
		ArrayList<String> myList = new ArrayList<>(); // This is the syntax to create a list 
		
		myList.add("BJJ");
		myList.add("Wrestling");
		myList.add("MMA");
		myList.add("KickBoxing");
		myList.add("NoGi");
		
		
		for (String item : myList) { // This is how to access each String item within the list
			System.out.println(item);
		}
	}

}
