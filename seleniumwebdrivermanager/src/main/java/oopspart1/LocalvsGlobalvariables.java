package oopspart1;

public class LocalvsGlobalvariables {
	

	//global variables/class variables, declared in class but outside method,constructor/block
	//if we don't give values default values assigned to instance variables
	//actually there is no global variables in java. we call them instance variables
	
	String name = "Srinivas";
	int age = 30;
	char sex = 'M';

	public static void main(String[] args) {
		
		//local variables contains garbage values i.e. it is mandatory to initialize the local variables
				int a = 5;//local variables for main() method
				int b = 25;
				int c = a+b;
				
				System.out.println(c);
				
				LocalvsGlobalvariables obj = new LocalvsGlobalvariables();
				
				System.out.println(obj.name);
				
				System.out.println(obj.sum());

			}
			//local variables -- variables which are declared within method,constructor or blocks
			public int sum() {
			int a =10;
			int b = 15;//local variables for sum() method i.e. we can't access a=10,b=15 outside sum method
			int c = a+b;
			return c;
			
	}

}
