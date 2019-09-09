package day15_Scanner_String_Class;

import java.util.Scanner;

     /* package name: java.util
      * class name :  Scanner
      * import statement must be placed between package and class
      * import java.util.Scanner imports only Scanner class from Java.util
      * import java.util.*; imports all the classes from Java.util (java utility package)
      */

public class ScannerClass { 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		/*
		 * new : creates object from Scanner class
		 * System.in allows to input data
		 */
		
		System.out.println("Enter byte value");
		byte num = input.nextByte();//we assign input... to variable(byte num) to make it reusable,
	    System.out.println(num*5); //f.e num*5
		
		System.out.println("Enter short value");
		short num2 = input.nextShort();
		
		System.out.println("Enter int value");
		int num3 = input.nextInt();
		
		System.out.println("Enter long value");
		long num4 = input.nextLong(); // in console must be typed without L,l
		
		System.out.println("Enter boolean value");
		boolean result = input.nextBoolean();
		
		System.out.println("Enter float value");
		float num5 = input.nextFloat();//in console must be typed without F,f
		
		System.out.println("Enter double value");
		double num6 = input.nextDouble();
		System.out.println(num6);
		
		
		
		
		
		
		
	
	}

}
