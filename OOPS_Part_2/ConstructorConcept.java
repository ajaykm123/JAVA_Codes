package OOPS_Part_2;

public class ConstructorConcept {
	
	// This is default constructor- with 0 parameters.
	public ConstructorConcept() {
	System.out.println("This is default constructor with zero parameter");
	}
	
	//one input parameter
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("The value of i:"+i);
	}
	
	//two input parameter
	public ConstructorConcept(int a, int j) {
		System.out.println("The value of a is:"+a);
		System.out.println("The value of j is:"+j);
		
	}

	public static void main(String[] args) {
		
		//calling default constructor
		
		ConstructorConcept c= new ConstructorConcept();
		
		ConstructorConcept c1= new ConstructorConcept(10);
		
		ConstructorConcept c2= new ConstructorConcept(20,30);
			
		ConstructorConcept c3= new ConstructorConcept(40,50,60);
		}
		
	public ConstructorConcept(int x, int y, int z) {
		System.out.println("the value of x is:"+x);
		System.out.println("the value of y is:"+y);
		System.out.println("the value of z is:"+z);
		
	}
		
		
		
		
		
		
	}
	

