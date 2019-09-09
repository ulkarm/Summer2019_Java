package day15_Scanner_String_Class; 

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstname = input.next();
		
		System.out.println("Enter your last name: ");
		String lastname = input.next();
		
		String fullname = firstname+" "+lastname;
		
		System.out.println("Your full name is :"+ fullname);
		
		
	}

}
