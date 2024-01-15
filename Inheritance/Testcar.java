package Inheritance;

public class Testcar{

	public static void main(String[] args) {
		
		bmw b= new bmw();
		
		System.out.println("Son");
		b.start();
		b.theftsafety();
		b.stop();
		b.refuel();
		b.engine();
		
		
		System.out.println("parent");
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("***");
		 Car c1=new bmw();// child class object can be referred by parent class reference variable.
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
	}

}
