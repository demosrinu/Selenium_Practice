package javabasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
			
			String x[][]=new String[2][3];// 2 rows 3 columns
			
			System.out.println(x.length);// 2 rows
			System.out.println(x[0].length);// 3 columns
			
			//1st row
			x[0][0]="srinivas";
			x[0][1]="M";
			x[0][2]="30/10/1990";
			
			//2nd row
			x[1][0]="BC-D";
			x[1][1]="mncl";
			x[1][2]="software";
			
			for(int row=0; row<x.length; row++) //row=0;col=0-2
			{
				for(int col=0; col<x[0].length; col++) //row=1; col=0-2
					{
					System.out.println(x[row][col]);
					}
			}

	}

}
