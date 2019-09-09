package day15_Scanner_String_Class;

import java.util.Scanner;

public class String_Class {
	
	/*  next vs nextLine();
	 *  nextLine - returns the entire user input as a String 
	 *  next     - returns only one word at a time,
	 *  f.e Ms. Mahaddin with nextLine will print Ms. Mahaddin,
	 *      Ms. Mahaddin with next will print Ms only, 
	 *      and Mahaddin will be print on next line if there is next command      
	 */  
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstname = scan.nextLine();
		System.out.println(firstname);
		
		System.out.println("Enter your last name");
		String lastname = scan.nextLine();
		System.out.println(lastname);
		
		System.out.println("first name is: "+firstname);
		System.out.println("last name is: "+lastname);
		
		System.out.println("first name1");
		String firstname1 = scan.next();
		
		System.out.println("last name1");
		String lastname1  = scan.next();
		
		System.out.println("middle name1");
		String middlename1 = scan.next();
		
		System.out.println("first name is: "+firstname1);
		System.out.println("last name is: "+lastname1);
		System.out.println("middle name is: "+middlename1);
		
		
		
		
		
		
		
		
	}

}
