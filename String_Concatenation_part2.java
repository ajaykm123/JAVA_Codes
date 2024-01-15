package java_basics;

public class String_Concatenation_part2 {

	public static void main(String[] args) {
		
		int a= 100;
		int b=200;
		
		String x="Ajaya";
		String y="Mainali";
		
		double c= 12.12;
		double d= 12.12;
		
		// +(plus sign) is called as concatenation operator
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("Ajaya K Mainali");
		System.out.println(x);
		System.out.println("The new value of a+b+c+d is:"+(a+b+c+d));
		System.out.println("The value of a+b is:"+(a+b));
		System.out.println("The value of c+d is:"+(c+d));
		System.out.println(a-b);
		System.out.println(c-d);
	}

}
