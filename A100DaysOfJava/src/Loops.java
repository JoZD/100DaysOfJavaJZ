import java.util.*;
import javax.swing.*;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We'll calculate the are of square rectangle triangle and circle 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose an option: \n 1-Square \n 2-Rectangle \n 3-Triangle \n 4-Circle \n Please enter only the number that matches the option:");
		int option = input.nextInt();

		System.out.println(option);
		
		switch (option) {
		
			case 1: 
				int side = Integer.parseInt(JOptionPane.showInputDialog("Please enter the size of the side to calculate the area: "));
				int area =side * side;
				System.out.println("The area is "  + area);
				break;
				
				
			case 2: 
				int Length = Integer.parseInt(JOptionPane.showInputDialog("Please enter the size of the Length to calculate the area: "));
				int Width = Integer.parseInt(JOptionPane.showInputDialog("Please enter the size of the Width to calculate the area: "));
				int AreaR = Length * Width;
				System.out.println("The area of the rectangle is: " + AreaR);
				break;
				
			case 3: 
				double Base = Double.parseDouble(JOptionPane.showInputDialog("Please enter the size of the Base to calculate the area: "));
				double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter the size of the Height to calculate the area: "));
				double AreaT = 0.5 * Base * height;
				System.out.println("The area of the Triangle is: " + AreaT);
				break;
				
			case 4: 
				double radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the size of the Radius to calculate the area: "));
				double areaC = Math.PI * Math.pow(radius, 2);
				System.out.println("The area of the circle is: " + areaC);
				break;
			
		
			
		
		}

	}

}
