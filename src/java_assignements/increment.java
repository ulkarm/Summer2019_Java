package java_assignements;

public class increment {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = x++;
		int z = x+y;
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(x);
	
	    int a =2, b=a++, c=a*b;
	    a++;
	    b--;
	    --c;
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    
	    int d = 1;
	    d = -d-- + d++/-d-- * --d;
	    
	    System.out.println(d);
	    
	   
	    
	
	}	

}
