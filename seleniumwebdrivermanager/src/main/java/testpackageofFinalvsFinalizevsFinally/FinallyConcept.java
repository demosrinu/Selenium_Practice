package testpackageofFinalvsFinalizevsFinally;

public class FinallyConcept {

	public static void main(String[] args) {
		add();
		test();
		div();
        //finally is a block. it used always with try catch block
		//whatever we give in finally gets executed, does not matter Exception is coming or not
	}
	public static void add() {
		try 
		{
			System.out.println("inside add method");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
		finally 
		{
			System.out.println("finally block");
		}
	}
	public static void test() {
		try {
			System.out.println("inside test method");
		}finally {
			System.out.println("inside finally block");
		}
	}
	public static void div() {
		int i=10;
		try {
			System.out.println("inside div method");
			int k=i/0;
		}catch(ArithmeticException e) {
			System.out.println("inside catch block");	
		}finally {
			System.out.println("inside finally block");
		}

	}

}
