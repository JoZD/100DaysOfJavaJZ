import java.util.*;


public class Conditionals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Determine if a person is under age
		
		Scanner age = new Scanner(System.in);
		
		
		System.out.print("Please enter your age to determine if you are old enough: ");
		int agex = age.nextInt();
		
		if (agex > 17) {
			System.out.println("You are old enough!");
		}else {
			System.out.print("You are under age ):");
		}
		
		
		

	}

}
