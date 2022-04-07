package javabasics;

public class Ifelse {

	public static void main(String[] args) {
		
		int a=35;
		int b=20;
		int c=70;//comparison operators <,>,<=,>=,==,!=
		
		if(a>b & a>c)//false & false = false
			System.out.println("a is the greatest");
		else if (b>c)// nested if-else
			System.out.println("b is the greatest");
		else 
			System.out.println("c is the greatest");

	}

}
