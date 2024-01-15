package OOPS_Part_2;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
/* -The Hash Table class in JAVA is one of the oldest members of the JAVA collection Framework.
-A Hash Table is an unordered collection of key-value pairs, with a with a unique key for each value.
-In Hash table, data is stored in an Array of List format, with a distinct index value, for each data value.
*/	

		Hashtable h= new Hashtable();
		
		h.put("a", "Ajaya");
		h.put("k", "Kant");
		h.put("M", "Mainali");
		
		h.put(1, 100);
		h.put(2, 200);
		
		//System.out.println(h.size());
		
		//System.out.println(h.size());
		
		//System.out.println(h.get("a"));
		//System.out.println(h.get("k"));
		//System.out.println(h.get("M"));
		//System.out.println(h.get(1));
		//System.out.println(h.get(2));
		
		System.out.println(h.size());
		for(int x = 0; x<h.size();x++) {
			System.out.println(h.get(x));
		}
		
		//Hashtable<Integer,Integer>h2= new Hashtable<Integer, Integer>();
		//h2.put(3, 300);
		//Hashtable<Integer,String>h3= new Hashtable<Integer, String>();
		//h3.put(4,"AJ");
		
		
		}
		
	}


