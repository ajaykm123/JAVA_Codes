package Collections_In_JAVA;



import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String>ll= new LinkedList<String>();
		
		//add operation
		ll.add("Ajaya");
		ll.add("Kant");
		ll.add("Mainali");
		ll.add("QA");
		ll.add("Manager");
		ll.add("CEO");
		
		
		System.out.println("The Content of LinkedList:"+ll);
		
	
		//add first operation
		ll.addFirst("AJ");
		System.out.println("The Content of LinkedList:"+ll);
		
		//last last operation
		ll.addLast("M");
		System.out.println("The Content of LinkedList:"+ll);
		System.out.println(ll.size());
		
		// .get method
		System.out.println(ll.get(6));
		
		//.set method
		ll.set(0, "Puja");
		System.out.println("The Content of LinkedList:"+ll);
		ll.set(7, "Sharma");
		System.out.println("The Content of LinkedList:"+ll);
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The Content of LinkedList:"+ll);
		
		//remove from any specific position
		ll.remove(1);
		System.out.println("The Content of LinkedList:"+ll);
		
		// How to print all the values of LinkedList
		//For Loop
		System.out.println("***using for loop");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//Advanced For Loop
		System.out.println("***using advanced for loop");
		for(String st : ll) {
			System.out.println(st);
		}
		//Iterator
		System.out.println("***using iteration");
		 Iterator<String> it= ll.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 //While loop
		 System.out.println("***using while loop");
		
		 int a=0;
		 while(a<ll.size()) {
			 System.out.println(ll.get(a));
			 a++;
		 }
		 
		 }
		 
		 
		 
		 
		 }
		
	
	

		
	


