package oopspart1;

public class StaticandNonstaticConcept {

		//global variables
		String name = "srinivas";//non static global variable
		static int age = 30;//static global variable

		public static void main(String[] args) {
			
			//static methods and variables
			
			sum();// calling directly
			StaticandNonstaticConcept.sum();//calling by class name
			
			//non static methods and variables
			StaticandNonstaticConcept obj = new StaticandNonstaticConcept();//creating a object
			
			System.out.println(obj.name);
			System.out.println(age);
			
			obj.srinu();//calling non static method by object reference
			
			obj.sum();//we can also call static method by object reference but warning will be given
			
	}
		
		public static void sum()
		{
			System.out.println("static method");
		}
		
		public void srinu()
		{
			System.out.println("nonstatic method");
		}

	}
