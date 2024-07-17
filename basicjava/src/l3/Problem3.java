package l3;

import java.util.Scanner;

public class Problem3 
{

public static void main(String[] args) 
{

	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Problem3 p=new Problem3();
	int rem=0;
	int s=0;
	while(n>0)
	{
		rem=n%10;
		s=s+rem;
		
		n=n/10;
		
	}
	System.out.println(s);
}
}
