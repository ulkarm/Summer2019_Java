package day14_Scanner;

public class warmup {
	
	/*
	 1. write a program that can display the days
	 		if the day is Monday or Tuesday:
							Java class days
			if the day is Thursday or Friday:
							Selenium class days
			if the day is Wednesday or Saturday:
			                SQL class days
			otherwise: day off
				(DO NOT use if statement) 
	 */
	
	public static void main(String[] args) {
		
		String day = "Wednesday";
		
		switch (day) {
		    case "Monday":
		    	System.out.println("Java class");
		    	break;
		    case "Tuesday":
		    	System.out.println("Java class");
		    	break;
		    case "Wednesday":
		    	System.out.println("SQL");
		    	break;
		    case "Thursday":
		    	System.out.println("Selenium");
		    	break;
		    case "Friday":
		    	System.out.println("Selenium");
		    	break;
		    case "Saturday":
		    	System.out.println("SQL");
		    break;
		    
		    	default:
		    		System.out.println("Day off");
		    		
		}
		
		//version 2 with or logic //shorter
		
		switch (day) {
	    case "Monday":
	    	
	    case "Tuesday":
	    	System.out.println("Java class");
	    	break;
	    	
	    case "Wednesday":
	    	
	    case "Saturday":
	    	System.out.println("SQL");
	    	break;
	    	
	    case "Thursday":
	    	
	    case "Friday":
	    	System.out.println("Selenium");
	    	break;
	    
		    
    	default:
    		System.out.println("Day off");
    		
		}	
		
	}

}
