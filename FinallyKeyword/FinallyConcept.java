package FinallyKeyword;

public class FinallyConcept {

	public static void main(String[] args) {
		
		test1();
		test2();
		division();
		division2();
		
	}
	
	public static void test1() {
		try {
			
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
			
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			
			System.out.println("inside finally block");
		}		
	}
	
	
	public static void test2() {
		try {
			System.out.println("Inside test 2");
		}
		finally {
			System.out.println("Finally code in test 2 method");
		}
	}
	public static void division() {
		System.out.println("*** Arithmetic exception***");
		int i=10;
		try {
		System.out.println("division Inside try block");	
		int k= i/0;
		}
		catch(ArithmeticException e){
			System.out.println("Inside catch block");
			System.out.println("divided by zero error");
		}
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
	
     public static void division2() {
    	 System.out.println("Null pointer Exception");
    	 
    	 int a=10;
    	 try {
    		 System.out.println("division2 inside try block");
    		 int l= a/0;
    	 }
    	 catch(NullPointerException n) {
    		 System.out.println("Inside null pointer exception");
    	 }
    	 finally { 
    		 System.out.println("Finally");
    		 
    		 
    	  }
    	 
     }
     
}

