package day07_Uneray_ShortHand;

public class Quiz {
	
	public static void main(String[] args) {
		
		// question 1:
		 int a = 30;
		 int b = (byte) a;
		 System.out.println(b); //30
		 
		 
		 //question 2: compile error, because a was after System syntax.
		 
		 //Question 3:
		 
		 System.out.print("Result A"+ 0 + 1);
		 
		 //"Result A" is a text, Result A01
		 
		 System.out.print("; Result B" + (1) + (2) +"\n"); // ";" before result word is to seperate line 1 with line 2 
		 
		 //";Result B" is text, ResultB12
		 
		 
		 //Question 4
		 
		 System.out.println("5+2="+3+4);
		 // "5+2=" is text, it will print "5+2=" as a text, concate 3 and 4, so it will print 5+2=34
		 
		 System.out.println("5+2="+(3+4));
		 //// "5+2=" is text, it will print "5+2=" as a text, (3+4) is 7, so it will print 5+2=7
		 
		 //Question 5
		 
		 float FloatNum = 100.9876543f;
		 short ShortNum = (short) FloatNum; //we casted float to short, short is whole number, 
		                                   //that's why it is 100,not 100.0
		 System.out.println(ShortNum);
		 
		 //Question 6
		 
		 //byte a1 = 200;
		 //int b1 = 2;
		 
		 //System.out.println(a1+b1-b1+a1/b1);// it will fail, because byte can't contain 200.
		 
		 //but f.e if it was int = 200
		 
		 int a1 = 200;
		 int b1 = 2;
		 
		 System.out.println(a1+b1-a1*b1+a1/b1); // in this case -98
		 
		 //Question 7
		 
		 System.out.println((3+2)*2/3%2); // will give 1
		                  // 5*2/3%2
		                  // 10/3%2 
		                  // 3%2
		                  // 1
		 
		//Question 8
		 
		//int a2=9, b2=0, c2=a2/b2;
		
		//System.out.println(c2*b2); it will compile, but will give error
		 
		 
		//Question 9
		 
		long a3=3_000l;
		double b3=(float)a3; //narrowing, casting
		int c3=(short)b3;
		
		System.out.println(c3%1000); 
		                  // 3000%1000= 3000/1000=0; will give 0
		
		//Question 10
		
		double a4 = 10/3;
		System.out.println(a4); 
		// first a4 = 10 / 3 = 3; because we didn't write 10.0 system recognize it as int number,whole number
		// that's why it will be 10 /3 = 3 (without remainder)
		// then  we assign a4 (3) to a decimal (double), that's why it will be 3.0
		
		//Question 11
		
		double a5 = 10.0/3;
		System.out.println(a5);
		// 10.0/3 = 3.333 as one of the numbers is decimal, it will give decimal answer (3.333)
		
		//xtra examples for Question 10 and 11
		
		System.out.println(10/3f); // will give 3.333 because 3f is decimal
		System.out.println(10/3d); // will give 3.333 because 3d is decimal
		System.out.println(10/3l); // will give 3 because 10 and 3l are whole numbers
		System.out.println(10%3); // will give 1 because 10 and 3l are whole numbers
		System.out.println(10.5%3); // will give 1.5 because 10.5 is decimal
		
		//Question 12
		
		//String str = "10.5" +3;
		//int num = (int)str;
		//System.out.println()num;
		//will not compile, because string is a text,and text can not be assigned to number
		//string is not a primitive, can not be assigned to primitive 
		
		//Question 13
		
		int a6 = 10, b6 = 20, c6 = 30;
		a6 = b6%5; // 10%5=0
		b6 = c6%5; // 20%5=0
		c6 = a6*b6; // 0*0=0
		
		System.out.println(a6 + " " + b6 + " " + c6);
		// a6 = 10/5= 2 10 % 5 remainder is 0
		// b6 = 20/5= 4 20 % 5 remainder is 0
		// c6 = 0*0 = 0
		
		
		
		
		
		
		
		
		
		                 
		
		
		
				 
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
