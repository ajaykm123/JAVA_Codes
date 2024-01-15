package java_basics;
// We need to have package in every program that we create
public class Data_Types_part1 {
// The class is public and the class name is Data_Types
	public static void main(String[] args) {
		// All the programs need to be written inside of the class
		// class keyword has to start with small letter
		//public is also a keyword. public also falls under access modifier. Public means this class is public and available for anyone whether it be inside of class or outside of class.
		//We can only execute the program inside the main method
		// Main is a method here
		// - Comment- It means some information that is written inside the code. If we want to give the information about the code, then they are mentioned inside the comment. Everything written inside the comment will not affect the code.
		
		//1. Integer
		int i = 10;
		i=20;// Here I am replacing the value of i from 10 to 20
		int i1 = 20;
		int i3= -1;
		int i4= 0;
		int i5= +1;
		int i2= i+i1;
	//	int i6= 12.12;// this is a double value. We cannot store double in integer.
		System.out.println(i5-(i3));
		
		
		
		//2. Double
		double d= 12;// We can store integer in double.
		double d1= 3.14;
		
		
		
		//3. Char
		char c= '$';
		char c1= '$';
		//char c2= '$$'; we cannot store two character in one variable.
		
		
		
		byte b=123;
		int i9=1234567890;
		long l= 1234567890000000000L;
		short s= 12345;
		float f= 121232134234342134214423342432432112432.33F;
		double d2=21312332142343432412343143241234123421421432142134212134213412341223412341234123421342134123412341234123421341242344444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.23;
		
		
		
		//4. Boolean
		boolean bb= true;
		boolean bbb= false;
		
		//5. String 
		String s1= "Ajay";
		String s2= "123";
		String s3= "$";
		String s4= "3.14";
	
	}

}
