package pattern;

import java.util.Scanner;

public class Pattern_01
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of row:");
	int row=sc.nextInt(),i,j;
	int[] ar= {1,0};
	for(i=0;i<=row;i++)
	{
		for(j=0;j<=i;j++)
		{
			if(ar[j]==1)
			{
				System.out.print(" 1");
			}
			else {
				System.out.print(" 0");
			}
		}
				System.out.println();
	}
	
	}
}
