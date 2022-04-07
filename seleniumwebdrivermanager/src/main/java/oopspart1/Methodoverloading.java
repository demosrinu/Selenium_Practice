package oopspart1;

public class Methodoverloading {

	public static void main(String[] args) {

		//method overloading
				Methodoverloading obj = new Methodoverloading();
				obj.srinu();
				obj.srinu(10);
				obj.srinu(20, 30);
				obj.srinu('M');
			}
			
			//main method can also be overloaded
			//duplicate methods are not allowed i.e. same method name with same no. of arguments/input parameters
			//same method name with same no. of arguments with different data  types can be allowed
			
			public void srinu() {
				System.out.println("srinu method with 0 input parameter");
			}
			
			public void srinu(int x) {
				System.out.println("srinu method with 1 input parameter");
				System.out.println(x);
			}
			
			public void srinu(int a, int b) {
				System.out.println("srinu method with 2 input parameter");
				System.out.println(a+b);
			}
			
			public void srinu(char c) {
				System.out.println("srinu method with 1 input parameter");
				System.out.println(c);
			

	}

}
