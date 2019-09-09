package day10_IF_statement;

public class multi_branch_IF_statement {
	public static void main(String[] args) {
		
		int num1 =200, num2 =100, num3 =300;
		
		if (num1>num2 && num1>num3) {
			
			System.out.println(num1 + " is the bigger number");
		}
		
		else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " is the bigger number");
		}
		else if (num3>num1 && num3>num2) {
			System.out.println(num3 + " is the larger number");
		}
		
		else if ( num3==num2 && num3>num1) {
			System.out.println(num3 +" and " + num2 + " are the bigger numbers");
	    }
		
		else if ( num3==num1 && num3>num2) {
			System.out.println(num1+" and "+num3+" are the bigger numbers");
		}
		
		else if (num1==num2 && num2>num3) {
			System.out.println(num1+" and "+num2+" are the bigger numbers");
		}
		
		else {
			System.out.println("all of them are equal");
		}

}
}