package OOPS_Part_2;

public class LocalVSGlobal_Variables {

	String name= "Ajaya"; // This is Global variable or Class variables
	int age=28; // This is Global variable or class variables.
	public static void main(String[] args) {
		
		
		int i=10;
		LocalVSGlobal_Variables obj= new LocalVSGlobal_Variables();
	
	
		
		String s=obj.name;
		System.out.println(s);// Ajaya
		int t= obj.age;
		System.out.println(t);//28
		System.out.println(i);//10
		
			int y=obj.sum();
			System.out.println(y);//500
	
		
	}
	
	public int sum() {
		int i=200;
		int j= 300;
		int k= i+j;
		return k;
		
		
	}

}
