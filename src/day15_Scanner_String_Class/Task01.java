package day15_Scanner_String_Class;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		/* Write a program that calculates the sum of two numbers entered by the user.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1 = input.nextInt();
		
		System.out.println("Enter the second number");
		int n2= input.nextInt();
		
		System.out.println("The sum is: "+(n1+n2));//(n1+n2) for concatination reason 
	}

}
