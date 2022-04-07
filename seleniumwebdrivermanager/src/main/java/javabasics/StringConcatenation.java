package javabasics;

public class StringConcatenation {

	public static void main(String[] args) {


		int a=-10;
		int b=20;
		String c="sandaveni";
		char d='s';
		boolean e=true;
		double f=23.45;
		
		System.out.println(a+b);//10
		System.out.println(c+d);//sandavenis
		System.out.println(a+b+c+d+e+f);//10sandavenistrue23.45 a is added to b
		System.out.println(c+d+a+b);//sandavenis-1020 sandavenis+a is added to b
		System.out.println(a+c+b+d);//-10sandaveni20s
		System.out.println(c+d+(a+b));//sandavenis10
		System.out.println(a+b+f+c+d+e);//33.45sandavenistrue

	}

}
