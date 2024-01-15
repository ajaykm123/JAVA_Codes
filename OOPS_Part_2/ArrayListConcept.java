package OOPS_Part_2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
	ArrayList ar= new ArrayList();

	ar.add(100);//0
	ar.add(200);//1
	ar.add(300);//2
	
	System.out.println(ar.size());
	ar.remove(2);
	System.out.println(ar.size());
	System.out.println("***");
	ar.add(400);//3
	ar.add(500);//4
	ar.add("Ajaya");//5
	ar.add(12.33);//6
	ar.add('$');//7
	ar.add(true);//8
	
	System.out.println(ar.size());
	System.out.println(ar.get(5));
	System.out.println("***");
	
	for(int x=0;x<ar.size();x++) {
		System.out.println(ar.get(x));
	}
	
	ArrayList<Integer>ar1= new ArrayList<Integer>();
	
	ar1.add(1);
	//ar1.add("Ajaya");
	
	ArrayList<String>ar2= new ArrayList<String>();
	
	
	}

}
