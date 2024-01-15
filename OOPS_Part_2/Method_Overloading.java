package OOPS_Part_2;

public class Method_Overloading {

	public static void main(String[] args) {
	
		Method_Overloading obj= new Method_Overloading();
		
		
		obj.sum();
		obj.sum(10);
		obj.sum(20,20);

	}
	
	public static void main(int i) {
		
	}
	
	public static void main( int a, int o) {
		
	}
	
	public void sum() {// 0 input parameter
		System.out.println("Sum method->Zero Input parameter");
	}
	
	public void sum(int i) {// 1 input parameter
		System.out.println("Sum method-> One input parameter");
		System.out.println(i);
	}
	public void sum( int i, int k) {
		
		System.out.println("Sum method-> Two input parameter");
		System.out.println(i+k);
		
	}

}
