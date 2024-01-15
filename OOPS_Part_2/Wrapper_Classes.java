package OOPS_Part_2;

public class Wrapper_Classes {

	public static void main(String[] args) {
		
		// Converting from String to Int
		String s="100";

		System.out.println(s+20);// This is simple String concatenation
	int i	= Integer.parseInt(s);
	
	System.out.println(i+20);
	
	
	// Converting from String to Double
		String y= "12.33";
		
		System.out.println(1+y);
		
		double d= Double.parseDouble(y);
	System.out.println(d+1);
	
	
	// String to Boolean.
	
	String k = "true";
	boolean b= Boolean.parseBoolean(k);
	System.out.println(b);
	
	
	//int to String Conversion
	
	int j=200;
	System.out.println(j+20);
	
	String z= String.valueOf(j);
	System.out.println(z+20);
	
	
	
	
	}
	
	


}
