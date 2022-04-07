package oopspart1;

public class Person {
	
	//Class variables
		String name;
		int age;
		char sex;
		double percentage;

	public static void main(String[] args) {
		
		Person a = new Person(); //"new Person()" is the Object of Person class
		Person b = new Person(); //a,b,c --- object reference variables
		Person c = new Person(); //new keyword is used to create the object
		
		a.name = "venky";
		a.age = 30;
		a.sex = 'M';
		a.percentage = 64.50;
		
		b.name = "ajay";
		b.age = 25;
		b.sex = 'M';
		b.percentage = 52.50;
		
		c.name = "nandu";
		c.age = 07;
		c.sex = 'M';
		c.percentage = 70.50;
		
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.sex);
		System.out.println(a.percentage);
		
		System.out.println("*****");
		
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.sex);
		System.out.println(b.percentage);
		
		System.out.println("*****");
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		System.out.println(c.percentage);
	}

}
