package Interface;

public class TestBank {

	public static void main(String[] args) {
	
		// We cannot create an object of an interface. But we can create an object of a class.
		//USBank u= new USBank();
		
		HSBCBank h= new HSBCBank();
		
		h.credit();
		h.debit();
		h.transfermoney();
		h.educationloan();
		h.carloan();
		h.mutualfund();
		
			System.out.println("***");

// This is dynamic or run time polymorphism.
	// Child class object can be referred by parent class reference variable- Inheritance
	// child class object can be referred by parent Interface reference Variable.- Interface
	// In Run time polymorphism we can only call overridden method.	
		 USBank u1=new HSBCBank();
		 u1.credit();
		 u1.debit();
		 u1.transfermoney();
		 
		// USBank.min_bal=15; 
		//We cannot change the value of the variable in Interface once it is declared.it's like 
		 
		System.out.println(USBank.min_bal);
		System.out.println(USBank.s);
		 
	}

}
