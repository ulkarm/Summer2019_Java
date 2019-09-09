package day15_Scanner_String_Class;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		// 2. Write the program to enter 3 numbers and returns the largest number
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		double num1 = input.nextDouble();
		
		System.out.println("Enter num2");
		double num2 = input.nextDouble();
		
		System.out.println("Enter num3");
		double num3 = input.nextDouble();
		
		double Largest = (num1>num2 && num1>num3) ? num1
				           :(num2>num1 && num2>num3) ? num2
						     : num3;
		System.out.println("Largest number is "+Largest);
			
	}

}
