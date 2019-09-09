package day16_Review;

import java.util.Scanner;

public class WarmUp {
	
	/* write program that asks user to enter first and last name, then prints out 
	 * the user's full name in all capital letters.
	 */
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);// first and last name will be saved in scan's memory
	System.out.println("Enter your first name and last name");
	String firstname = scan.nextLine(),//toUpperCase;
	    	lastname = scan.nextLine();//toUpperCase;
	String  fullname = firstname +" "+lastname;
	System.out.println("Your full name is: "+fullname);
	}

}
