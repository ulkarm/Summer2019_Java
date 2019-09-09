package day12_Switch_Statements;

public class WarmUp {
	
	public static void main(String[] args) {
		
		int num1=4;
		int num2=4;
		int num3=4;
		
		if (num1==num2 && num1!=num3) { // true//
			System.out.println("num1 is equal to num2");
			}
		else if (num1==num3 && num1!=num2) {
			System.out.println("num1 is equal to num3");
		    }
		else if (num2==num3 && num1!=num2) {
			System.out.println("num2 is equal to num3");
		}
		else if (num1==num2 && num2==num3) {
			System.out.println("All of them are equal");
		}
		else {
			System.out.println("None of them is equal");
		}
	
		
		//version 2//
		
		int n1=5, n2=5, n3=5;
		
		if(n1==n2 && n2==n3) {
			System.out.println("all of them are equal");
		}
		else if (num1==num2) {
			System.out.println("num1 and num2 are equal");
		}
		else if (num1==num3) {
			System.out.println("num1 and num3 are equal");
		}
		else {
			System.out.println("none of them are equal");
		}
	

		
		//version 3//
		
		int a=10, b=20, c=30;
		
		if(a==b && b==c) {
			System.out.println("all are equal");
		}
		else {
			if(a==b) {
				System.out.println("a and b are equal");
			}
			else if(a==c) {
				System.out.println("a and c are eaqual");
			}
			else if(b==c) {
				System.out.println("b and c are equal");
			}
			else {
				System.out.println("none of them are equal");
			}
		}
		
		// 60 ~ 70 => D
		// 70 ~ 80 => C
		// 80 ~ 90 => B
		// 90 ~ 100 =>A
		//  0 ~ 59 => F
		// must be 0~100
		
		int grade = 70;
		
		if (grade>=0 && grade<=100) { //not minus, not more than 100
			
             if (grade>=60) { //if 60 and more
            	 
            	if (grade>=90) {
            		System.out.println("A");
            	}
            	else if (grade>=80) {
            		System.out.println("B");
            	}
            	else if (grade>=70) {
            		System.out.println("C");
            	}
            	else {
            		System.out.println("D");
            	}
             } else {
            	 System.out.println("Failed");
             }
		} else {
			System.out.println("Invalid Entry");
		}
}
}
		

