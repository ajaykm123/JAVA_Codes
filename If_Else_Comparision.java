package java_basics;

public class If_Else_Comparision {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		int g=70;
		int h=80;
		int i=100;
		int j=100;
		
		
		
		if(a>b & a>c & a>d & a>e & a>f & a>g & a>h & a>i & a>j) {
			System.out.println("A is the greatest ");
		}
		
		else if(b>a & b>c & b>d & b>e & b>f & b>g & b>h & b>i & b>j) {
			System.out.println("B is the greatest ");
		}	
		
		else if(c>a & c>b & c>d & c>e & c>f & c>g & c>h & c>i & c>j) {
			System.out.println("C is the greatest ");
		}
		
		else if (d>a & d>b & d>c & d>e & d>f & d>g & d>h & d>i & d>j) {
			System.out.println("D is the greatest");
		}
		
		else if(e>a & e>b & e>c & c>d & e>f & e>g & e>h & e>i & e>j) {
		System.out.println("E is the greatest");
		}
		
		else if(f>a & f>b & f>c & f>d & f>e & f>g & f>h & f>i & f>j) {
			System.out.println("F is the greatest ");
			
		}
		else if(g>a & g>b& g>c & g>d & g>e & g>f & g>h & g>i & g>j) {
			System.out.println("G is the greatest");
			
		}
		else if(h>a& h>b & h>c & h>d & h>e & h>f & h>g & h>i & h>j) {
		System.out.println("H is the greatest");
		
		}
		else if(i>a & i>b & i>c & i>d & i>e & i>f & i>g & i>h & i>=j) {
			System.out.println("I and J are the Greatest");
		}
		else if(j>a & j>b & j>c & j>d & j>e & j>f & j>g & j>h & j>=i){
		System.out.println("J and I are the greatest");
		}

		//--------------------------------------------------------------------
		
		// Equal to equal to ==
		int c1= 40;
		int d1=40;
		if(c1==d1) {
			System.out.println("C1 and D1 are equal");
		}
		else {
			System.out.println("C1 and D1 aren't equal");
		}
		
		
		
		//---------------------------------------------------------------------
		// Not Equal to !=
		int x= 20;
		int y=30;
		if(x!=y) {
			System.out.println("X and Y are not equal");
		}
		else {
			System.out.println("X and Y are equal");
		}
	}
}
		


