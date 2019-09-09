package day15_Scanner_String_Class;

public class WarmUp {
	
	/* write a java program that can convert numbers between 0~9 to words,
	 * if the number is greater than 9 or less than 0, output should be "Invalid"
	 */
	
	public static void main(String[] args) {
		
		// version #1 with multi-branch if statement//
		
		int num = 10;
		String result = "";
		
		if (num>=0 && num<=9) {
			if (num==9) // we can use with or without {},because it's gonna contain 
				result ="nine"; // only one if statement within it,not like first one
			else if (num==8)
				result = "eight";
			else if (num==7)
				result = "seven";
			else if (num==6)
				result = "six";
			else if (num==5)
				result = "five";
			else if (num==4)
				result = "four";
			else if (num==3)
				result = "three";
			else if (num==2)
				result = "two";
			else if (num==1)
				result = "one";
			else
				result = "zero";
		} else {
			result = "Invalid";
		}
		System.out.println(result);
		
		// version #2 with switch statement//
		
		// version #3 with ternary //
		
		int n = 5;
		
		String r = (n==9) ? "nine" 
				 : (n==8) ? "eight"
				 : (n==7) ? "seven"
				 : (n==6) ? "six"
				 : (n==5) ? "five"
				 : (n==4) ? "four"
				 : (n==3) ? "three"
				 : (n==2) ? "two"
				 : (n==1) ? "one"
				 : (n==0) ? "zero"
				          : "Invalid";
		
		System.out.println(r);
				 
				 
		
		
		
		
	}
	

}
