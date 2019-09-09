package java_assignements;

public class Task02_Time {
	
	public static void main(String[] args) {
		
		int hour = 13;
		int min = 59;
		int sec = 33;
		
		boolean H = hour >=0 && hour <=23;
		boolean M = min >=0 && min<=59;
		boolean S = sec >=0 && sec<=59;
		
		
		String PM = "PM";
		String AM = "AM";
	
		if ( H && M && S) {
			System.out.println(hour+":"+min+":"+sec+" AM");
		}
		
		
		else if ( H && M && S ) {
			System.out.println(hour+":"+min+":"+sec+" PM");
		}
		
			
			
		}
		

	}


