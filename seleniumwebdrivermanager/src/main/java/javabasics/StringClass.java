package javabasics;

public class StringClass {

	public static void main(String[] args) {
		
		String name = "Selenium webdriver world";
		
		System.out.println(name.charAt(5));
		
		boolean status=name.startsWith("Selenium");
		System.out.println(status);
		
		boolean status1=name.endsWith("webdriver");
		System.out.println(status1);
		
		String[] a=name.split(" ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		String name1 = "Selenium WebDriver World";
		
		boolean status2 = name.equals(name1);
		System.out.println(status2);
		
		boolean status3 = name.equalsIgnoreCase(name1);
		System.out.println(status3);

	}

}
