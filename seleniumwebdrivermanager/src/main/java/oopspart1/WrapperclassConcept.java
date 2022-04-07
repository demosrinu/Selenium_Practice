package oopspart1;

public class WrapperclassConcept {

	public static void main(String[] args) {
		
				//wrapper class --- data type conversion 
				String s = "-100";
				String x = "100";
				String y = "100A";
				
				System.out.println(s+20);
				System.out.println(x+20);
				System.out.println(y+20);
				
				//string to integer conversion
				int i = Integer.parseInt(s);
				int i1 = Integer.parseInt(x);
				//int i2 = Integer.parseInt(y);
				System.out.println(i+20);
				System.out.println(i1+20);
				//System.out.println(i2+20); number format exception
				
				String s1 = "45.68"; 
				System.out.println(s1+4.32);
				
				//String to double conversion
				double d = Double.parseDouble(s1);
				System.out.println(d+4.32);
				
				String s2 = "yes"; //string is other than boolean value
				String s3 = "true";
				String s4 = "";   //string is null
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(s4);
				
				//String to boolean conversion
				boolean b = Boolean.parseBoolean(s2);
				boolean b1 = Boolean.parseBoolean(s3);
				boolean b2 = Boolean.parseBoolean(s4);
				System.out.println(b);
				System.out.println(b1);
				System.out.println(b2);
				
				//Integer to String conversion
				int p = 10;
				System.out.println(p+2);
				String s5 = String.valueOf(p);
				System.out.println(s5+2);
				
				//double to String conversion
				double d1 = 23.45;
				String s6 = String.valueOf(d1);
				System.out.println(s6+9);
				
				//char to string conversion
				char c = 'M';
				String s7 = String.valueOf(c);
				System.out.println(s7);
				
				//Boolean to string conversion
				boolean b3 = false;
				String s8 = String.valueOf(b3);
				System.out.println(s8);

	}

}
