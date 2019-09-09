package java_assignements;

public class Task04_HTTPstatusCode {
	
	public static void main(String[] args) {
		
		int StatusCode  = 203;
		
		String finalResult = "Invalid Status"; //if it gives the number which is not on list//
		
		
	    if ( StatusCode == 200) {
			finalResult = "OK";
			}
	    
	    else if (StatusCode ==201) {
	    	finalResult = "Created";
	    	}
	    
	    else if (StatusCode ==202) {
	    	finalResult = "Accepted";
	    }
		
	    else if (StatusCode ==301) {
	    	finalResult = "Moved Permanently";
	    }
	    
	    else if (StatusCode ==303) {
	    	finalResult = "See Other";
	    }
	    
	    else if(StatusCode ==304) {
	    	finalResult = "Not Modified";
	    }
	    
	    else if(StatusCode ==307) {
	    	finalResult = "Temporary Redirect";
	    }
	    
	    else if(StatusCode ==400) {
	    	finalResult = "Bad Request";
	    }
	    
	    else if(StatusCode ==401) {
	    	finalResult = "Unauthorized";
	    }
	    
	    else if(StatusCode ==403) {
	    	finalResult = "Forbidden";
	    }
	    
	    else if(StatusCode ==404) {
	    	finalResult = "Not found";
	    }
	    
	    else if(StatusCode ==410) {
	    	finalResult = "Gone";
	    }
	    
	    else if(StatusCode ==500) {
	    	finalResult = "Internal Server Error";
	    }
	    
	    else if(StatusCode ==503) {
	    	finalResult = "Service Unavailable";
	    }
	    
	    System.out.println("status code "+StatusCode+ " is : " +finalResult );
	    
  	   
	}

}

