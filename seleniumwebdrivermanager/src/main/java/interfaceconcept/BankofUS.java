package interfaceconcept;

public interface BankofUS {
	
	int min_bal = 10000;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method prototypes, no method body, only method declaration
	//in interface we can declare the variables, variables are static by nature and will not be changed
	//we can not create the object of interface
	//interface is abstract in nature
	//no main method in interface
	//no static methods in interface 


}
