package day14_Scanner;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Byte Value");
		byte byteNum = input.nextByte();
		System.out.println("You have entered: "+byteNum);
		
		System.out.println("Enter another byte value");
		byte byteNum2 = input.nextByte();
		System.out.println("You have entered: "+byteNum2);
		
		System.out.println("Addition is: "+(byteNum+byteNum2));
	    //(byteNum+byteNum2 should be in () to give addition result,
		// otherwise it will be concated with String "Addition is:")
		
	}

}
