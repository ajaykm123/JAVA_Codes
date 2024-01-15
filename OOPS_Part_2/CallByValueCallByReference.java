package OOPS_Part_2;

public class CallByValueCallByReference {

		int p;
		int q;
	
	public static void main(String[] args) {
		
		// This is call by value 
		CallByValueCallByReference obj = new CallByValueCallByReference();
		
		int x=1;
		int y=2;
		int u= x+y;
		System.out.println(u);//3
		
		
		int a1= obj.testsum(x,y);// This is call by value or pass by value 
		System.out.println(a1);  //70
		
		
		// This is now call by reference
		obj.p=50;
		obj.q=60;
		obj.swap(obj);// t= obj
		System.out.println(obj.p);//60
		System.out.println(obj.q);//50
	}
	
	public int testsum(int a, int b) {
	
		a=30;
		b=40; 
		int c= a+b;
		return c;
	}
	
	
	// This is call by reference 
	public void swap(CallByValueCallByReference t) {
		
	int temp;
	temp = t.p;// temp is 50
	t.p= t.q;// t.p= 60
	t.q= temp;// t.q= 50
	
		
		
		
	}
	
	
}
