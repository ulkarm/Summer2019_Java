package day08_ShortHandOperators;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 9;
		boolean result = a > b;
		
		System.out.println(a + " is greater than " + b + " - " + result);
		
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount<OrangesCount || OrangesCount >= PearsCount;
		             // 20 < 30 || 30 >=30//
		             // true || true//
		             // true //
		
		System.out.println(comp);
		
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shiny";
		Degree = 70;
		
		boolean comp2 = (!(OutsideWeather=="Rainy"||Degree==70));
                      // (!(Shiny == Rainy || Degree == 70//
		              // (!( false || true //
		              // (!( true)//
		              // (not true)
		              // false //
		System.out.println(comp2);
		
		int b2 = 2;
		boolean res = ++b2 == 2 || --b2 == 2 && --b2 == 2;
		     // res = 3 = 2 || 2 = 2 && 1 = 2;
		     // res = false || true & false
		     // false || false
		     // false 
		System.out.println(res);
		
		boolean x = true, z = true;
		int y = 20;
		x = (y!=10)||(z=false);
		
		//true = (true) || (false)
		// true = true 
		// true
		
		System.out.println(x);
		
	 
    
	}
	

}
