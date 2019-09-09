package day13_Review;

public class Assestment_Quiz03 {
	
	public static void main(String[] args) {
		
		//Q 1:
		
		int num = 9;
		
		if (num++==10) {
			//9++=9 ==10 //false
			System.out.println("Hello World"+num);
		}
		else {
			System.out.println("Hello Universe"+num);
			//num is already 10
		}
		
		//Q 2:
		
		int score = 0; // two single if// each will executed
		
		if (score == 0) {
			//true
			score+=50;
			//if its true 0+50=50 /gets executed
			}
		if (score !=0) {
			//score is already 50, so 50 !=0 which is true
			score +=50; //50+50=100
			System.out.println(score);//will print 100
		}
		 
		//Q :3
		
		
		char grade ='A';
		boolean Passed = grade =='A' || grade =='B'; 
		               //true        || false = in or logic 1 true, 1 false makes true
	                   //true||false=true
		boolean Passed2 = grade =='C' || grade =='D';
		               // false       || false = in or logic 2 false makes false
		               // false || false = false
		
		if (Passed || Passed2) { 
			//true || false = true
			System.out.println("You have passed the exam");
		}
		else {
			System.out.println("You failed");
		}
		
		//Q 4:
		
		boolean A1 = true, B1=!false; //B1=!false ==> B1=true
		
		if (B1) {
			System.out.println("B"); 
		}
		else if (A1) {
			System.out.println("A");
		}
		else {
			System.out.println("C");
		}
		
		//Q 5:
		
		boolean result = true;
		
		if (result) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//else if{
			//System.out.println("none"); // it will give compile error,
			                            //because else should be closing statement,
			                            // and this "else if" should be before "else"
		// Q 8:
		
		boolean A2 = true, B2 =!A2; // B2 = !true ==> B2 = false
		
		if (B2) {
			//true
			if(B2) {
			//false
				System.out.println("Monday");
			}
			else {
				System.out.println("Tuesday");
			}
		}
		else {
			if(B2) {
				//true
				System.out.println("Thursday");
				
			} else {
				System.out.println("Friday");
			}
		}
		
		// Q 9:
		
		int number = 10;
		
		if(--number > 10) {
		 //--10 = 9 >10 ==> false
			System.out.println("Hello Cybertek"+number); //number is already 9
		}
		else if(number==9) {
			//true
			System.out.println("Hello World"+number);
		}
		
		// Q 10:
		
		boolean X1 = true;
		boolean Y1 = !X1==false;
		      //Y1 = not true==false ==>true
		boolean Z1 = Y1; // we assigned Y1 which is true to Z1
		
		if(X1) {
			System.out.println("Hello Everyone");
		}
		if(Y1) {
			System.out.println("Today is great day");
		}
		if(Z1) {
			System.out.println("We have a picnic on Saturday");
		}
		
		// extra sample
		
		int age = -17;
		
		if(age>=0 && age<=150) {
		//not to accept minus age, not to accept more than 150
			if(age>=18) {
				if(age>=70) { // >=70, <=150 //more than 70, less than 150
					System.out.println("can vote 3 times");
				}
				else if(age>=50) { //>=50,>70 more than 50,less than 70
					System.out.println("can vote 2 times");
				}
				else { //<50, >=18 less than 50, more than 18
					System.out.println("can vote 1 time");
				}
			} else { // <18, >0, less than 18, more than 0
				System.out.println("Not eligible to vote");
			}
		} else { // < 0, less than 0
			System.out.println("Invalid Entry");
		}
		
}
		        
}

