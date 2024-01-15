package OOPS_Part_2;

public class Shifting_object_reference_from_one_object_to_another {

	int model;
	int makeyear;
	
	public static void main(String[] args) {
		
		
		
		
		
		
		Shifting_object_reference_from_one_object_to_another a = new Shifting_object_reference_from_one_object_to_another();
		Shifting_object_reference_from_one_object_to_another b= new Shifting_object_reference_from_one_object_to_another();
		Shifting_object_reference_from_one_object_to_another c= new Shifting_object_reference_from_one_object_to_another();
		
		a.model=1;
		a.makeyear=2015;
		
		b.model=2;
		b.makeyear=2016;
		
		c.model=3;
		c.makeyear=2017;
		
		
		System.out.println("Before assigning the references");
		System.out.println(a.model);
		System.out.println(a.makeyear);
		
		
		System.out.println(b.model);
		System.out.println(b.makeyear);
		
		System.out.println(c.model);
		System.out.println(c.makeyear);
	
	
		System.out.println("After Assigning the references");
		
				/*a=b
				b=c
				c=a
				so, 
				a=2
				b=3
				c=2.
				Now, A(1) isn't referring to any object. A(1) has no reference.*/

		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);//Here a is 10
		c.model=20;
		System.out.println(a.model);//now the value of a has changes and is 20
		System.out.println(c.model);
		

	}

}
