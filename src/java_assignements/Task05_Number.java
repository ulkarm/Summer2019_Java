package java_assignements;

public class Task05_Number {
	
	public static void main(String[] args) {
		
		int num = -50;
		
	    if (num>0) {
	    	System.out.println("positive");
	    }
		
		if (num==0) {
			System.out.println("zero");
			
		}
		
		if (num<0) {
			System.out.println("negative");
		}
		
		//option 2 // shorter option
		
		int number = -50;
		String str = "zero";
		
		if (number>0) {
			str = "positive";
		}
			
			
		if (number<0) {
			str = "negative";
			
		}
		
		System.out.println(number + " is "+ str);
	}

}
