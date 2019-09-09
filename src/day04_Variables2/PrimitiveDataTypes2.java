package day04_Variables2;

public class PrimitiveDataTypes2 {

	
	/*
	 * byte,short,int,long,float,double,boolean,char
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		
		System.out.println(result);
		System.out.println(result2);
		
		//boolean result3 = 9 is greater than 3
		
		//boolean result4 = "Earth is Flat";
		//boolean num1 = 100; boolean only takes true or false
		
				
		
		char char1 = '9';
		System.out.println(char1);
		
		char char2 = 90;
		System.out.println(char2); //90 is Z on ASCII table
		
		char char3 = 'Z';
		System.out.println(char3);
		
		char char5= '9'; //will print 9 as a single character
		
		int int5 = '9'; //will print 57/ will convert to number from ascii table because you can assign only numbers to int
		
		int5 = char5; //will print 57/ will convert to a number from ascii table  table because you can assign only numbers to int
		
		char char6 = 9; // will print horizontal tab, because it's not assigned as single character in '', 
		               //it will take it as a number 9 which is horizontal tab in ascii table
		char char7 = 84; // same like char6, without '' it converts number to character which is T
		
		
		
	    System.out.println(char5);
		System.out.println(int5);
		System.out.println(int5);
		System.out.println(char6);
		System.out.println(char7);
		
		
		
		
		
	}
}
