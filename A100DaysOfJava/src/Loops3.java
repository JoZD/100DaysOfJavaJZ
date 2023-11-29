import java.util.*;
import javax.swing.*;
public class Loops3 {

	public static void main(String[] args) {
		// Generate a Random number, in the less times possible, and count how many attempts it took, using while 
		
		// Create a Random number first 
		Random random = new Random();
		
		int randomNumber = random.nextInt(10); // This will generate the random number between 0 (Inclusive) and 100
		
		int guess = 11;
		int attempts = 0;
		
		
		while (guess != randomNumber) {
			guess = Integer.parseInt(JOptionPane.showInputDialog("Please guess the random number, it is set from 0 to 10!"));
			attempts += 1;
			if (guess != randomNumber) {
				JOptionPane.showMessageDialog(null, "Oops. that was not the number, try again!" );
			}else {
				break;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Right guess! It took " + attempts + " attempts!");
		

	}

}
