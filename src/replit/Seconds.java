package replit;

import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter seconds:");
		
		int inputSeconds = input.nextInt();
		
		
		int hour = inputSeconds/3600;
		int min = inputSeconds%3600/60;
		int sec = inputSeconds%60;
		

		System.out.println(hour+" hours, "+min+" minutes,and "+sec+" seconds");
		
		
		
		
		
		
		
		
		
	
		
	}
	
	

}
