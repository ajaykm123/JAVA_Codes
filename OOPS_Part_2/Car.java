package OOPS_Part_2;

public class Car {

	// This session is about Classes and Objects in JAVA
	
	int model;//Class Variable or Global variable,
	int wheel;//Class Variable or Global variable,
	
	public static void main(String[] args) {
		
// The copy for global variable will be given to all the objects i.e. Car a, Car b, Car c.
		Car a= new Car();// This is object 
		Car b= new Car();// This is object 
		Car c= new Car();// This is object
		
		/*Car is the class name.
		 a,b,c is the object reference variable
		= is the assignment operator
		new key word is used to create an object of the Car class.
		new Car(); is the object. Everything that is on the Right hand side is the object*/ 
		
		a.model= 2014;
		a.wheel= 4;
		
		b.model=2015;
		b.wheel=3;
		
		c.model=2016;
		c.wheel=2;
		
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		
		
	}

}
