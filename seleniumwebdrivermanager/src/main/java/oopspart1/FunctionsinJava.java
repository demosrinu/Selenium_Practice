package oopspart1;

public class FunctionsinJava {

	public static void main(String[] args) {
		

		FunctionsinJava obj = new FunctionsinJava();
		
		obj.main();//calling methods by creating and calling using objects
		
		int d = obj.abc();
		System.out.println(d);
		
		String s1 = obj.pqr();
		System.out.println(s1);
		
		int add = obj.add(10, 20);
		System.out.println(add);
		
		char c2 = obj.srinu();
		System.out.println(c2);

	}
	
	public void main() {
		System.out.println("testing method");//return type=void, void--does not return any value
	}//no input no output
	
	public int abc() {
		System.out.println("abc method");// return type= int
		int a = 1;//no input some output
		int b = 2;
		int c = a+b;
		return c;
	}
	
	public String pqr() {
		System.out.println("pqr method");// return type = string
		String s = "Selenium";// no input some output
		return s;
	}
	
	public int add(int x, int y) {
		System.out.println("add method");// return type = int
		int z = x+y;//some input some output
		return z;
		
	}
	
	public char srinu() {
		System.out.println("srinu method");// return type = char
		char c1 = 'M';//no input some output
		return c1;

	}

}
