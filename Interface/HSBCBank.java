package Interface;

public class HSBCBank implements USBank,Brazilbank {
	
	

	public void credit() {
		System.out.println("HSBC-->credit");
		
	}
	public void debit() {
		System.out.println("HSBC-->debit");
		
	}
	public void transfermoney() {
		System.out.println("HSBC-->transfer money");
		
	}
	
	public void mutualfund() {
		System.out.println("Brazil bank--> Mutual Fund");
	}
	
	public void educationloan() {
		System.out.println("HSBC-->Educationloan");
	}
	
	public void carloan() {
		System.out.println("HSBC-->CarLoan");
	}
	
}
