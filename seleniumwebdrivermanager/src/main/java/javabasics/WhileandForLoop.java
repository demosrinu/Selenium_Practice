package javabasics;

public class WhileandForLoop {

	public static void main(String[] args) {
		
		int i=1;//initialization part
		
		while(i<=10) //conditional part
		{
		System.out.println(i);
		i++;//increment/decrement part, without this part "while" generate infinite loop
		}
		
		System.out.println("*****");
		
		for(int j=10;j>=1;j--)//(initialization;condition;increment/decrement)
		{
		System.out.println(j);
		}
		
		//do while
		int k = 9;
		do {
			System.out.println(k);
		}while (k<=10);

	}

}
