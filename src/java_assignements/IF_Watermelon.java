package java_assignements;

public class IF_Watermelon {
	
	public static void main(String[] args) {
		
		int num;
		boolean alot;
		alot=false;
		num=40;
		
		
		if(num>=10) {
			System.out.println("I have more than 20 watermelons");
			alot=true;
		}
		if(alot) {
			System.out.println("Good Job");
		}
		if(alot==false) {
			System.out.println("I need more watermelon");
		}
	}

}
