package day11_IF_statementReview;

public class GradeCalculator {
	
	public static void main(String[] args) {
		
		int grade = 80;
		boolean A = grade >=90 && grade <=100;
		boolean B = grade >=80 && grade <=89; //or <90
		boolean C = grade >=70 && grade <=79;
		boolean D = grade >=60 && grade <=69;
		boolean ValidGrade = grade >=0 && grade<=100;
		
		if (ValidGrade) {
		
		if (A) {
			System.out.println("You made A");
		}
		
		else if (B) {
			System.out.println("You made B");
		}
		
		else if (C) {
			System.out.println("You made C");
	    }
		
		else if (D) {
			System.out.println("You made D");
		}
		
		else {
			System.out.println("You made F");
		}
			
		} else {
			System.out.println("Invalid Grade");
		}
		
		
		
	}

}
