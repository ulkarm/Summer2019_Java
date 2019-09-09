package day10_IF_statement;

public class if_else_statement {
	
	public static void main(String[] args) {
		
		
		if ( 9>=8 ) {
			System.out.println("9 is greater or equal to 8");
		} 
		
		else {
				System.out.println("9 is less than 8");
			
		} // if 9 is not greater or equal to 8, then 9 must be less than 8;
		
		
		
		int angle1= 25, angle2= 80, angle3 = 75;
		
        boolean valid = (angle1 + angle2 + angle3) == 180;
         
        if (valid) {
        	System.out.println("valid triangle");
        } else {
        	System.out.println("invalid triangle");
        }
    
        
        String a   = "Is it cold outside?";
        String yes = "true";
        String no  = "false";
        
        boolean result1 = Boolean.valueOf(yes);
        boolean result2 = Boolean.valueOf(no);
        
        System.out.println(a);
        
        if (result2) {
        	System.out.println("Wear a Coat");
        	System.out.println("Wear a Hat");
        	}
        else {
        	System.out.println("It's nice");
        }
       //this code doesn.t look right//
		
		
		
	}

}

 