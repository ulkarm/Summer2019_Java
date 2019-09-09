package day12_Switch_Statements;

public class Switch_Statements {
	
	public static void main(String[] args) {
		
		int score = 2;
		if(score==1) { //must give boolean expression//
			System.out.println("1");
		}
		else if (score==2) {
			System.out.println("2");
		}
		else {
			System.out.println("Invalid Entry");
		}
		
		
		switch(score) { //must give an expression:data
			case 1:
				System.out.println("1");
				break;
				
			case 2:
				System.out.println("2");
				break;
				
			default:
				System.out.println("Invalid");
				
		}
		
		String str = "Java";
		
		switch (str) {
		
		default: //else / can be anywhere
			System.out.println("Invalid");
		
		case "C#":
			System.out.println("C# programming language");
			break; // after statement, closing the statement
			
		case "Python":
			System.out.println("Python programming language");
		
		}
		
		
		char grade = 'A';
		
		switch (grade) {
		
		default:
			System.out.println("Failed");
		   
		case 'B':
			System.out.println("Passed with B");
			
		case 'C':
			System.out.println("Passed with A");
		}
		
		
		
	}

}
