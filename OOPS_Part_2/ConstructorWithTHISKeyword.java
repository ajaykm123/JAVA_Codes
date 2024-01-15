package OOPS_Part_2;

public class ConstructorWithTHISKeyword {
	
	// This is class variable or global variable
	String name;
	int age;
	
	
	public ConstructorWithTHISKeyword(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(name);
	System.out.println(age);
		
		
	}

	public static void main(String[] args) {
		
	ConstructorWithTHISKeyword c = new ConstructorWithTHISKeyword("AJ",28);
		
	

	}

}
