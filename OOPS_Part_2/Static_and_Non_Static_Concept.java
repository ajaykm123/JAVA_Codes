package OOPS_Part_2;

public class Static_and_Non_Static_Concept {

	String name="Ajaya";// non- static global variable
	static int age =28;//static global variable
	public static void main(String[] args) {
		
		// Calling static method
		sum();// By calling by method name directly
		Static_and_Non_Static_Concept.sum(); // Call by using the (class name.methodname)
		
		// Calling Static Variables
		
		System.out.println(age);// Direct calling 
		System.out.println(Static_and_Non_Static_Concept.age);// Calling by class name
		
		// For non- static methods
		Static_and_Non_Static_Concept obj= new Static_and_Non_Static_Concept();
		String a=obj.name;
		System.out.println(a);
		obj.sendmail();
		obj.sum();

	}
	
	public void sendmail() {// This is non-static method
		System.out.println("Send Mail non static method");
	}
	
	
	public static void sum() {// this is Static method
		System.out.println("Sum method,static method");
	}
	
	public void Test(String[] args) {
		int g;
		int h;	
	}
	
	
	
	
	
}
