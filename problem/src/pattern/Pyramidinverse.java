package pattern;

import java.util.Scanner;

public class Pyramidinverse 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		int i,j=0;
		for(i=row; i>=1; i--)
		{
			for(j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
