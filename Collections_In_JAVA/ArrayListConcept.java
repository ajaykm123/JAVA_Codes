package Collections_In_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static<E>void main(String[] args) {
		
		// This is static array 
		 int a[]= new int[3];

		
// This is dynamic array
		
		 // This also is non-generic array 
		ArrayList ar= new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		
		
		ar.add(50);
		ar.add(60);
		
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		
		//for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			
		//generics array in JAVA
			ArrayList<Integer>ar1 = new ArrayList<Integer>();
			ar1.add(1);
			ar1.add(2);
			System.out.println(ar1.get(0));
			System.out.println(ar1.get(1));
			
			
			
			ArrayList<E>ar3= new ArrayList<E>();
			
			
			}
			
		
		//creating employee class object
		
		Employee e1= new Employee("Ajaya",28,"QA");
		Employee e2= new Employee("Kant",38,"Manager");
		Employee e3= new Employee("Mainali",48,"CEO");
		
		
		// create array list
		ArrayList<Employee>ar6= new ArrayList<Employee>();
		
		
		ar6.add(e1);
		ar6.add(e2);
		ar6.add(e3);
		
		
		// using iterator 
		
		Iterator<Employee> it= ar6.iterator();
		while(it.hasNext()) {
			Employee y = it.next();
			System.out.println(y.name);
			System.out.println(y.age);
			System.out.println(y.dept);
		}
		
		//add all method
		ArrayList<String> ar5= new ArrayList<String>();
		
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("JAVA");
		
		
		ArrayList<String> ar7= new ArrayList<String>();
		
		ar7.add("Dev");
		ar7.add("JAVA");
		ar7.add("Python");
		
		
		ar5.addAll(ar7);
		for(int a1=0;a1<ar5.size();a1++) {
			System.out.println(ar5.get(a1));
		}
		
		
		//remove all method
		System.out.println("Remove all method");
		ar5.removeAll(ar7);
		for(int a1=0;a1<ar5.size();a1++) {
			System.out.println(ar5.get(a1));
			
			
		}
		
		//retain all method- if we want to check the comman values 
		System.out.println("Retain all method");
ArrayList<String> ar8= new ArrayList<String>();
		
		ar8.add("Test");
		ar8.add("Selenium");
		ar8.add("JAVA");
		
		
		ArrayList<String> ar9= new ArrayList<String>();
		
		ar9.add("Dev");
		ar9.add("JAVA");
		ar9.add("Python");
	
		ar8.retainAll(ar9);
		for(int z=0;z<ar8.size();z++) {
			System.out.println(ar8.get(z));
		}
		
		
	}

}