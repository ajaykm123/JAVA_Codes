package OOPS_Part_2;

public class Functions_In_JAVA {

	public static void main(String[] args) { // the main method is static 
		
		// obj is the reference variable of the below created object. 
		Functions_In_JAVA obj= new Functions_In_JAVA ();
		obj.test();
		int l= obj.pqr();
		System.out.println(l);
		
		String s=obj.qa();
		System.out.println(s);
		
		int k= obj.division(20, 10);
		System.out.println(k);
		
	}	
		// non-static methods
		
	
	// public means it is publicly available
	// test is the method name
	//{ - this is the starting body of method
	//} - This is the ending body of method
	public void test() { // This is a method
		
		System.out.println("Test Method");
		
	}
	
	public int pqr() {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("pqr method");
		System.out.println();
		
		return c;
	}
	
	public String qa() {
		System.out.println("QA Method");
		String s= "Selenium";
		
		return s;	
	}
	
	/*we pass the value inside the brackets
	 x and y are the input parameters or input arguments..*/
	// return type of this method is int. 
	public int division (int x, int y) {
		System.out.println("Division Method");
		int d= x/y;
		return d;
		
		
	}

}
