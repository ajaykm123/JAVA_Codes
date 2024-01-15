package java_basics;
public class Array_Concept {


	public static void main(String[] args) {
	//1.Integer array
	//We have integer array variable here i.e. i.	
	int i[]= new int[4];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;

	/*System.out.println(i[0]);
	System.out.println(i[1]);
	System.out.println(i[2]);
	System.out.println(i[3]);*/
	
	//System.out.println(i[4]); if we try to print the size that we haven't declared then JAVA will throw us an error"Array Index Out of Bound Exception"
	
	
	//To print the size of the array we have a .length method
	//System.out.println(i.length);

	//If you want to print all the values of an array at once.We will have to use the For loop Concept
	
	for(int j=0;j<4;j++) {
		System.out.println(i[j]);
	}
	for (int j1=0;j1<i.length;j1++) {
		System.out.println(i[j1]);
	}
	
	//2.Double array
	double d[]= new double[5];
	d[0]=12.12;
	d[1]=13.13;
	d[2]=14.14;
	d[3]=15.15;
	d[4]=16.16;
	
	for(int a=0;a<d.length;a++) {
		System.out.println(d[a]);
	}
	
	//3.Character array
	char c[]=new char[5];
	c[0]='A';
	c[1]='J';
	c[2]='A';
	c[3]='Y';
	c[4]='A';
	
	for(int k=0;k<c.length;k++) {
		System.out.println(c[k]);
	}
	
	//4. boolean array
	boolean b[]= new boolean[2];
	b[0]=true;
	b[1]=false;
	
	for(int b1=0;b1<b.length;b1++) {
		System.out.println(b[b1]);
	}
	
	//5. String array
	String s[]= new String[3];
	s[0]="Ajaya";
	s[1]="Kant";
	s[2]="Mainali";
	
	for(int s1=0;s1<s.length;s1++) {
		System.out.println(s[s1]);
		System.out.println(s.length);
	}
	
	//6.Object Array
	Object ob[]= new Object[6];
	ob[0]="Ajaya Kant Mainali";
	ob[1]=28;
	ob[2]=6502292643L;
	ob[3]='$';
	ob[4]="12/18/2023";
	ob[5]=555.55;
	
	for(int k=0;k<ob.length;k++) {
		System.out.println(ob[k]);
		System.out.println(ob.length);
	}
	
	Object ob1[]= new Object[5];
	ob1[0]="AJ";
	ob1[1]="555";
	ob1[2]='@';
	ob1[3]=true;
	ob1[4]=11.11;
	
	for(int z=0;z<ob1.length;z++) {
		System.out.println(ob1[z]);
	}
	
	}
	}


