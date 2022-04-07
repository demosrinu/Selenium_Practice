package oopspart1;

public class CallByValueandCallByReference {
	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueandCallByReference obj = new CallByValueandCallByReference();
		int x = 15;
		int y = 25;
		obj.test();//call by value or pass by value
		
		System.out.println(x+y);
		
		System.out.println("*****");
		
		//call by object reference
		obj.p = 40;
		obj.q = 50;
		
		//before swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("*****");
		
		obj.swap(obj);//call by reference or pass by reference
		
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int test()
	{
		int a = 10;//values of a and b does not effect x and y values
		int b = 20;//x and y are as just as photocopies assigned to a and b
		int c = a+b ;
		return c;
	}
	
	public void swap(CallByValueandCallByReference t)
	{
		int temp;
		temp = t.p;//temp = 40
		t.p = t.q;//t.p = 50
		t.q = temp;//t.q = 40
	}

}
