import javax.swing.*;
public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Undetermined Loops While Do-While   determined loops for for - each
		
		String Clave = "Password";
		
		String pass = "";
		
		while (Clave.equals(pass) == false ) {
			pass = JOptionPane.showInputDialog("Please enter your password! ");
			
		}
		JOptionPane.showMessageDialog(null, "Password Accepted!");
		

	}

}
