package day12_Switch_Statements;

public class IF_wout_curly {
	
	public static void main(String[] args) {
		
		// without curly brace "if block" can not hold more than one statement
		// it's not recommended to write a code without curly braces,but it's possible
		if (true) {
			System.out.println("hello");
			System.out.println("hello");
		} else {
			System.out.println("world");
		}
		
		if (true)
			System.out.println("Hello");
		 // System.out.println("Hello"); // without { second statement gives error
	    else 
	    	System.out.println("World");
		
		
		
		
	}

}
