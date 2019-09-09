package day12_Switch_Statements;

public class Home_Task {
	
	public static void main(String[] args) {
		
		String model = "Apple";
		
		
		switch (model) {
		      case "Apple":
			         System.out.println("Apple - no virus");
			         break;
			    
		      case "Dell":
		    	  System.out.println("Tough one");
		    	  break;
		    	  
		      case "Acer":
		    	  System.out.println("Cheap one");
		    	  break;
		    	  
		      default:
		    	  System.out.println("Do not buy that one");
		}
		
		
	}
	
}


