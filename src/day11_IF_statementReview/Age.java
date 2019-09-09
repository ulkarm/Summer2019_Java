package day11_IF_statementReview;

public class Age {
	
	public static void main(String[] args) {
		
		int age = 23;
		boolean GoodPerson = false;
		
		if (age >=18) {
			if (GoodPerson)
				System.out.println("Alcohol is bad for your health");
		}
		else {
			System.out.println("You can buy cigarettes");
			if (age>=21) {
				System.out.println("You can buy Hookah");
			}
			else if (age>=25) {
				System.out.println("You can buy alcohol");
			}
			
		else {
			System.out.println("buy milk");
		}
		
		
	}

	}
}
