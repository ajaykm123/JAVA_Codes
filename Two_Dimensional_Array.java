package java_basics;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
			
	/*		0,0(A)		0,1(B)		0,2( C )	0,3(D)		0,4( E )
			1,0(A1)		1,1(B1)		1,2(C1)		1,3(D1)		1,4(E1)
			2,0(A2)		2,1(B2)		2,2(C2)		2,3(D2)		2,4(E2)*/
		
		
		String x[][]= new String[3][5];
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		/*System.out.println(x.length);//This will give us the total number or Rows
		System.out.println(x[0].length);//This will give us the total number of columns.
		
		System.out.println(x[0][0]);
		System.out.println(x[1][0]);
		System.out.println(x[2][0]);
		System.out.println(x[2][4]);*/
		
		//If we want to print all the values of two dimensional array.
		// We need to use two For loop. One for Row and another for column.
		
		for(int a=0;a<x.length;a++) {//This is for row
		for (int a1=0;a1<x[0].length;a1++) {// This logic is for column
			System.out.println(x[a][a1]);
		}	
			
		}

	}

}
