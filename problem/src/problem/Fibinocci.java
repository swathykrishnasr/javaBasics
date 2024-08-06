package problem;

import java.util.Scanner;

public class Fibinocci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit=sc.nextInt();
		int c=0;
		int b=1;
		int a=1;
		System.out.println("1");
		while(c<=limit)
		{
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		
	}
}
