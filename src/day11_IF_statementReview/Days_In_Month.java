package day11_IF_statementReview;

public class Days_In_Month {
	
	/* 1. Write a program to find days in month
	 * 
	 * Jan  Feb  Mar  Apr  May  Jun  Jul  Aug  Sep  Oct Nov  Dec
	 *  31   28   31   
	 * 
	 */
	public static void main(String[] args) {
		
		int month = 5;
		
		if(month >0 && month<13) {
			if(month == 1) {
				System.out.println("31 days");
			}
			else if (month ==2) {
				System.out.println("28 days");
			}
			else if (month ==3) {
				System.out.println("31 days");
			}
			else if (month == 4) {
				System.out.println("30 days");
			}
			else if (month ==5) {
				System.out.println("31 days");
			}
			else if (month ==6) {
				System.out.println("30 days");
			}
			else if (month ==7) {
				System.out.println("31 days");
			}
			else if (month %2==0) {
			    System.out.println("31 days");
			}
			else {
				System.out.println("30 days");
			}
			
		}
		
		else {
			System.out.println("Invalid Entry");
		}
		
		
		// version2 // easier // shorter

        int month2 =10;
        int year2 = 2001;
        
        if (month2>0 && month2<13) {
        	
          if (month2 == 2) {
        	  
        	if (year2 %4 ==0) {
        	System.out.println("29 days");
        }
        	else {
        		System.out.println("28 days");
        	}
          }
        else if ( month2 ==4 || month2 == 6) {
        	System.out.println("30 days");
        }
        else if (month2 ==9 || month2 ==11) {
        	System.out.println("30 days");
        }
        else {
        	System.out.println("31 days");
        }
        
        } else {
        	System.out.println("Invalid Entry");
        }
		
		
        }
	
}

       
        
        









