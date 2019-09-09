package java_assignements;

public class Task03_BiggerNumber {
	
	public static void main(String[] args) {
		
		int num1 = 700;
		int num2 = 700;
		int num3 = 800;
		int max = 0;
		
		
		
		if (num1>num2 && num1>num3) {
			max=num1;
		   
			System.out.println(num1 + " is bigger number");
		}
		
		else if (num2>num3 && num2>num1){
			max=num2;
		
		    System.out.println(num2 + " is bigger number");
		}
		
		else if (num3>num1 && num3>num2){
			max=num3;
			
			System.out.println(num3 + " is bigger number");
		}
		
		else if (num1==num2 && num1>num3) {
			System.out.println(num1+" is equal to " + num2 + " and they are bigger numbers");
		}
		
		else if (num1==num3 && num1>num2) {
			System.out.println(num1+" is equal to " + num3 + " and they are bigger numbers");
		}
		
		else if (num2==num3 && num2>num1) {
			System.out.println(num2+" is equal to " + num3 + " and they are bigger numbers");
		}
		else  {
			System.out.println("They are equal");
		}
			 
	}
}
