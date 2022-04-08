package javalogiccodes;

public class Armstrong {

	public static void main(String[] args) {
		
		int a=153;
		int b=a%10;
		int p=b*b*b;
		
		int c=a/10;
		int d=c%10;
		int q=d*d*d;
		
		int e=c/10;
		int r=e*e*e;
		
		int s=p+q+r;
		
		if(s==a) {
			System.out.println(s+" is a armstrong");
		}else
			System.out.println(s+" is not a armstrong");
			}
		}
		


