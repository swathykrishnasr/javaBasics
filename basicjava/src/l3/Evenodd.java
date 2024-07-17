package l3;

import java.util.Scanner;

public class Evenodd
{
	void oddEven(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+"is even");
		}
		else {
			System.out.println(x+"is odd");
		}
	}
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Evenodd p=new Evenodd();
	int rem=0;
	while(n>0)
	{
		rem=n%10;
		p.oddEven(rem);
		n=n/10;
		
	}
	
}
}
