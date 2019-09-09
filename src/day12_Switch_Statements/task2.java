package day12_Switch_Statements;

public class task2 {
	
	public static void main(String[] args) {
		
		int num= 1;
		
		
		
		switch (num) {
		
		case 1 :
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3 :
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7: 
			System.out.println("Sunday");
			
		default:
			System.out.println("Funday");
				
		}
		
		String days = "Tuesday";
		
		 switch (days) {
		 
		     case "Friday":
			       System.out.println("Tuesday");
			       
		     case "Monday":
		    	 System.out.println("Monday");
		    	 break;
		    	 
		     case "Wednesday":
		    	 System.out.println("Wednesday");
		    	 break;
		    	 
		     case "Thursday":
		    	 System.out.println("Thursday");
		    	 break;
		    	 
		    	 default:
		    		 System.out.println("Funday");
		    	 
		    	 
		 }
	}

}
