package javabasics;

public class SwitchDemo {

	public static void main(String[] args) {


		int x = 4;
		
		switch (x)
		{
		case 1: System.out.println("poor performance");
		break;
		case 2: System.out.println("satisfactory");
		break;
		case 3: System.out.println("meeting expectations");
		break;
		case 4: System.out.println("employee of the year");
		break;
		default: System.out.println("you are fired");
		}

	}

}
