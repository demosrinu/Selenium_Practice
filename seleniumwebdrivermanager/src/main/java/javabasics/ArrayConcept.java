package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//int array
				int i[]=new int[4];
				i[0]=1;
				i[1]=2;
				i[2]=3;
				i[3]=4;
				System.out.println(i[2]);
				System.out.println(i.length);
				
				System.out.println("*****");
				
				
				//double array
				double d[]=new double[5];
				d[0]=1.2;
				d[1]=2.3;
				d[2]=3.4;
				d[3]=4.5;
				d[4]=5.6;
				
				for(int j=0; j<d.length; j++) 
				{
				System.out.println(d[j]);
				}

				System.out.println("*****");
				
				//char array
				char c[]=new char[3];
				c[0]='a';
				c[1]='&';
				c[2]='4';
				System.out.println(c[1]);
				
				System.out.println("*****");
				
				//boolean array
				boolean b[]=new boolean[2];
						b[0]=true;
						b[1]=false;
						
				System.out.println("*****");
				
				//String array
				String s[]=new String[3];
				s[0]="sandaveni";
				s[1]="srinivas";
				s[2]="yadav";
				
				for(int k=0;k<s.length;k++) 
				{
					System.out.println(s[k]);
				}
				
				System.out.println("*****");
				
				//Object array
				Object ob[]=new Object[5];
				ob[0]=1;
				ob[1]="srinivas yadav";
				ob[2]='M';
				ob[3]=89.83;
				ob[4]=true;
				
				for(int h=0;h<ob.length;h++) 
				{
					System.out.println(ob[h]);
				}

	}

}
