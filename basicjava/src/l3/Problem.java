package l3;

import java.util.Scanner;

public class Problem 
{
void largestNumber()
{
	System.out.println("Enter the first number:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Enter the Second number:");
	int b=sc.nextInt();
	System.out.println("Enter the third number:");
	int c=sc.nextInt();	
	if(a>b&&a>c)
	{
		System.out.println("largest number is "+a);
	}
	else if(b>a&&b>c)
	{
		System.out.println("largest number is "+b);
	}
	else
	{
		System.out.println("largest number is "+c);
	}
}
void checkNumber()
{
	System.out.println("Enter the  number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%2==0)
	{
	System.out.println(a+" is even");	
	}
	else 
	{
	System.out.println(a+" is odd");	
	}
}
	void multiplicationTable()
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
				int a=1;
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		System.out.println(++a+"*"+b+"="+(a*b));
		
	}
	public static void main(String[] args)
	{
		Problem p=new Problem();
		System.out.println("1:largest among 3 number\n2: check the no is odd or even\n3:Multiplication Table ");
		System.out.println("Please enter the option:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			p.largestNumber();
			break;
		case 2:
			p.checkNumber();
			break;
		case 3:
			p.multiplicationTable();
			break;
			default :
				System.out.println("INVALID OPTION");
		}
	}

}
