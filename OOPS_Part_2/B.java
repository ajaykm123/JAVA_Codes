package OOPS_Part_2;

public class B extends SUPER_Keyword{

	
	public B() {
		super();
		
		System.out.println("Child class constructor");
		
	}
	public B(int i) {
		super(i);
		
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) {
		
	
		SUPER_Keyword s= new SUPER_Keyword();
			B b1= new B(10);
		
			
			
	}
}
