package day13_Review;

public class QuizReview {
	public static void main(String[] args) {
		
		// Kahoot
		// Q1:
		
		if (!true != !false) {
			//false != true ==> true
			System.out.println("Cybertek");
		} 
		else {
			System.out.println("Batch 12");
		}
		
		
		// Q2:
		
		boolean resultA = 9>=9 || 10<=10,
				resultB = 'A'>= 128 && 'B' < 128;
				//resultA = true || true ==> true
				//resultB = false && true ==> false
				
		if(resultA) {
			//true
			
			if(resultB) {
				//false
				System.out.println(resultA);
			}
			else {
				System.out.println(resultB);
			}
		}
				
		//Q 3:
		
		if(true) {
			} 
		else if (false) {}
		
		//else block is not mandatory
		
		//Q 4:
		
		int num = 9;
		
		if(++num < 10) {
			// 10<10 = false
			System.out.println(num+"Hello World");//10Hello World
		} else {
			System.out.println(num+"Hello Universe"); //10Hello Universe
		}
		
		int num2 = 9;
		
		if(num2++ <10) {
			//9<10 = true
			System.out.println(num2+"Hello World");//10Hello World
		} else {
			System.out.println(num2+"Hello Universe"); //10Hello Universe
		}
			
		
	      
		//Q 5:
		
		int x = 1, y = 0;
		
		if(x++ > ++y) { 
			// 1 > 1 = false
			System.out.print("Hello");
		} else {
			System.out.print("Welcome");
		}
		System.out.println(" Log "+x+":"+y);
		           //Welcome Log    2  :  1
		
		// Q 7:
		
		
		boolean Result = true;
		int N = 100; 
		
		if(Result) {
			//true//
			N /=10; // 100/10=10
			Result = !Result; // Result = false // we assign not true expression to result
		}
		if(Result) {
			// Result is already false from last step
			N *=2; //will not execute, so N will stay 10
		}
		else {
			N -=5; // N = 10-5=5
		} 
		System.out.println(N);//will print final result of N, which is 5
		
		//Q 8:
		
		boolean X = true;
		
		if(X == false) {
		//true = false ==> false
			System.out.println("one");
		}
		else if(X == false !=true) {
		    //true = false !=true
			//true = true ==> true
			System.out.println("two");
		}
		else if(X == true) {
			//true
			System.out.println("three");
		}
		else if(X !=false) {
			//true
			System.out.println("four");
		}
		
		// Q 10:
		
		// 'A'=65, 'B'=66 in ASCII table
		
		int n = 'B'; //corresponding number of character will be assigned
		  //n = 66
		
		if( n>128 || n<=129 ) {
		  //false || true ==> true
			System.out.println('B');//it will print character B
			                        //if we print (n)then it will print 66
		}
		else {
			System.out.println('A');
		}	
	
	}
}
