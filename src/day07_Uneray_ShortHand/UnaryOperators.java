package day07_Uneray_ShortHand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		/*
		 * +  : positive
		 * _  : negative
		 * ++ : increment
		 * -- : decrement
		 * 
		 * +- = -
		 * -- = +
		 * ++ = +
		 * -+ = -
		 */
		
		int a = 10;
		int b = -a;
		System.out.println(b); // will print -10
		
		int c = +b; //
		System.out.println(b); // will give -10, because +(-10)=-10
		
		int d = -c; // -(-10)=10
		System.out.println(d);
		
		int f = -(10);
		System.out.println(f); //-(10)=-10
		
		// INCREMENT // 1)Pre Increment and 2)Post Increment
		
		// increases the value by 1 
		
		// 1. ++ Pre-Increment is placed before the variable and increases value by 1 immediately
		
		int num1 = 100;
		++num1;
		System.out.println(num1); // will increase immediately, that's why 101 right away
		
		int num2 = ++num1; // ++(101)=102
		System.out.println(num2);
		
		// 2.Post Increment ++ is placed after variable and increases value by 1 on next step
		
		int IntNum = 100;
		System.out.println(IntNum++); //will give now 100, will add 1 on next step
		System.out.println(IntNum); // this is next step,so it will print 101
		
		int IntNum2 = IntNum++; //  will give 101,because last value of IntNum was 101,
		                        // so first it will give 101 which is current value, 
		                        // then IntNum++ will add 1 on next step
		System.out.println(IntNum2); // 101
		System.out.println(IntNum);  // 102
		
		
		int x = 100;
		int y = x++ -1; // y = 100++ -1 = 99
		System.out.println(y);
		
		//DECREMENT 1)PRE Decrement; 2)Post Decrement
		
		// decreases value by one 
		
		// -- Pre Decrement is placed before the variable and decreases the value by 1 immediately
		
		int Z = 100;
		
		System.out.println(--Z); // will print 99
		
		// Post Decrement -- is placed after the variable and decreases the value by 1 on next step

		
		int Y = 95;
		System.out.println(Y--); // will print 95 for now
		System.out.println(Y);   // will print 94
		
		int T = 25;
		System.out.println(++T); //26
		System.out.println(--T); //25
		
		int P = 50; 
		P = --P + P++ + P-- + P++;
		  // pre  post  post  post
		  // 49 +  49  +  50   +49 = 197
		System.out.println(P); // 197
		  
		int X = 1;
		X = -X-- + X++ / -X-- + --X;
		
		System.out.println(X);
		
		// x= -1 -- + 1++ / -1-- + --1 = 
		
		x=2;
		y=x++;
		
		System.out.println(y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    
		
		    
	
		
		
		
		
		
		
		
		    
		
		
		
		
		
		
	}

}
