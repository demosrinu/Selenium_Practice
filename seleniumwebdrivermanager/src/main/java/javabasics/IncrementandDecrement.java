package javabasics;

public class IncrementandDecrement {

	public static void main(String[] args) {
		
		
		int i=1;
		int j=i++;
		System.out.println(i);//post increment
		System.out.println(j); //first i value stored into j
			
	System.out.println("***");

	int a=1;
	int b=++a;
	System.out.println(a);//pre increment
	System.out.println(b);//incremented a value stored into b

	System.out.println("***");

	int k=2;
	int l=k--;
	System.out.println(k);//post decrement
	System.out.println(l);//first k value stored into l

	System.out.println("***");

	int x=2;
	int y=--x;
	System.out.println(x);//pre decrement
	System.out.println(y);//decremented x value stored into y

	}

}
