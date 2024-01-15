package java_basics;

public class Increment_And_Decrement_Operator_Unary_Operator {

	public static void main(String[] args) {
		
		//Pre-increment(++X)
		//First increase the value of i.SO, I was one now, I=2.Then assign the value to j. So, J=2.
		int i=3;
		int j=++i;
		System.out.println(i);
		System.out.println(j);
		
		//Post increment(X++)
		//First assign the initial value to j1, then increase the value if i1.
		int i1=3;
		int j1= i1++;
		System.out.println(i1);
		System.out.println(j1);
		
		
		
		//Pre-decrement(--X)
		//First decrease the value of i2.So,i2=2.
		//Then assign the value to j2.SO,j2=2
		int i2=3;
		int j2=--i2;
		System.out.println(i2);
		System.out.println(j2);
		
		
		//Post-Decrement(X--)
		//First assign the value to j3.So, j3=3
		//Then decrease the value if i3.So, i3=2
		int i3=3;
		int j3=i3--;
		System.out.println(i3);
		System.out.println(j3);

	}

}
