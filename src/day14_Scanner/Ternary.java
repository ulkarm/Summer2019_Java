package day14_Scanner;

public class Ternary {
	
	public static void main(String[] args) {
		
		int num = 0;
		if (true) {
			num = 100;
		} else {
			num = 50;
		}
		System.out.println(num);
		
		// converting to Ternary//
		
		// if (condition) ==> (condition) ? 
		// else           ==>      :
		// else if        ==>  : (condition) ?
		// in ternary body we can give only a single value,
		// and it must return value//
		// ternary must be initialized to a variable or printed//
		
		int n = (true) ? 200 : 50; // ternary returns a value//
		int y = (false)? 200 : 50; // () not required, false ? : ==> is ok to write
		System.out.println(n);
		System.out.println(y);
		
		
		String Schoolname = "";
		boolean Batch12 = true;
		
		if(Batch12) {
			Schoolname = "Cybertek";
			
		} else {
			Schoolname = "Invalid";
		}
			System.out.println(Schoolname);
			
			System.out.println(Batch12 ? "Cybertek" : "Invalid"); //printed version
			
			String BestSchool = Batch12 ? "Cybertek" : "Invalid"; //initialized to variable version
			 
			
			// task:
			/* if you have good credit score interest rate should be 0.5%
			 * if you have bad credit score interest rate should be 0.9% 
			 */
			
			double interestRate = 0; 
			boolean GoodCredit = true;
			
			//1. we can initialize it to variable
			
			interestRate = (GoodCredit) ? 0.5 :0.9;
			System.out.println(interestRate);
			
		    //2. or we can just print it out directly
			
			System.out.println(GoodCredit ? 0.5 :0.9);
			
			//3. or 
			
			interestRate = (GoodCredit == true) ? 0.5 : 0.9;
			System.out.println(interestRate);
			               
			byte grade = 60;
			boolean Passed = grade >= 60 ? true : false;
			           // if grade is less than 60 or equal to 60, then true, else false
			System.out.println(Passed);
			
			char FinalGrade = 'A';
			String Group= "";
			
			if (FinalGrade == 'A') {
				Group = "As Early Bird";
			}
			else if (FinalGrade == 'B') {
				Group = "Group 1";
			} 
			else if (FinalGrade == 'C') {
				Group = "Group 2";
			}
			else {
				Group = "After Group 2";
			}
			System.out.println(Group);
			
			// converting to ternary
			
			Group = FinalGrade == 'A' ? "Early Bird"       // IF
				       : FinalGrade == 'B' ? "Group 1"     // Else If
				        	: FinalGrade == 'C' ? "Group 2" // Else If
				        		: "After Group 2";          // Else
			System.out.println(Group);
					
			
			
			int score = 80;
			char Finals = ' ';
			
			if (score >= 90 && score <= 100)
				Finals = 'A';
			else if (score >= 80 && score <= 89)
				Finals = 'B';
			else if (score >= 70 && score <= 79)
				Finals = 'C';
			else if (score >= 60 && score <= 69)
				Finals = 'D';
			else if (score >= 0 && score <= 59)
				Finals = 'F';
			else 
				Finals = ' ';
			
			// converting to ternary //
			
			Finals = (score >= 90 && score <= 100)? 'A' 
				:(score >= 80 && score <= 89)? 'B'
					:(score >= 70 && score <= 79)? 'C'
						:(score >= 60 && score <= 69)? 'D'
							:(score >= 0 && score <= 59)? 'F'
								: ' ';
			System.out.println(Finals);	
			
			int n1 = 100, n2 = 300, n3 = 500;
			int max = (n1>n2 && n1>n3)? n1
					 : (n2>n3 && n2>n1)? n2
						: n3;
			System.out.println(max);
			
	}

}
