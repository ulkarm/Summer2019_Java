package day03_Variables;

public class PrimitiveDataTypes {
	
	/* WHOLE NUMBERS variables //byte,short,int,long//
	 * 
	 * byte : we can assign only integers (numbers) which is not decimal (whole numbers) in range -128 to 127
	 * short : we can assign only integers (numbers) whole numbers within range -32,768 to 32,767 
	 * int : we can assign only whole numbers within range -2,147,483,648 to 2,147,483,647 (int use most often)
	 * long : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
	 *      // at the end of long number you can write letter l or L, which indicates that it belongs to long number //
	 *      byte - short - int - long
	 *      smaller one can be assigned to larger one 
	 */
	
	/* DECIMAL NUMBERS variables //float,double//
	 * 
	 * float : 4 bytes : we can assign decimal numbers (10.5, 21,7 etc), but it requires letter f or F at the end of number
	 * double : 8 bytes : we can assign decimal numbers (double is used more) doesn't need a letter at the end
	 *        // float and double also accepts whole numbers, so byte,short,int and long can be assigned to float or double//
	 */
	
	public static void main(String[] args) {
		
		byte length = 3;
		System.out.println(length);
		
		byte width = 4;
		System.out.println(width);
		
		// variable name must start with alphabet a-z, or A-Z, if it starts with number it will give error
		// variable name can not contain any special characters except _ and $
		// variable name must be unique 
		// variable name can not be java reserved words 
		// variable value must be in data range
		
		// wrong examples //
		
		// byte 9num=100;
		// byte num*=90;
		// length=6; lenght=8;
		// byte public=10;
		// byte num1 = -129
		
		//correct examples//
		
		byte myNum2 = 127;
		
		short num2 = 128;
		
		short num3 = 10000;
		
		int num4 = -1000000;
		
		
		// 100,000,000 in java would be written 100_000_000 , because in numbers only _ is accepted
		
		long longNumber = 10;
		long longnumber = 10L;
		int intNumber = 10;
		
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		
		short shortNumber2 = 18;
		//byte byteNumber2 = shortNumber2; // gives error,because can't compile, because you can't assign larger one to smaller one,because of memory use//
		
		// byte use 1 byte memory, short uses 2 bytes memory //
		
		int intNumber2 = -19876;
		long longNumber2 = intNumber2;
		
		short shortNumber3 = -30000;
		int intNumber3 = shortNumber3;
		short shortNumber4 = shortNumber3;
		
		float exampleNum2 = 10.5f;
		float exampleNum3 = 20.5F;
		
		double doubleNum1 = 10.5;
		
		double doubleNum2 = 30.5;

		System.out.println("============");
		
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("============");
		
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		

		System.out.println("============");
		
		double dNum = bNum;
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
		
		
		
		
		
				
		
		
		
		
		
		
				
		
		
		
		
		
				
		
		
		
		
				
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
