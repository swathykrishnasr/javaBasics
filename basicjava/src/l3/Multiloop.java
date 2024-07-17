package l3;

import java.util.Scanner;

public class Multiloop 
{
	void fact()
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1,fact=1;
		while(b<=a)
		{
			fact=fact*b;
			b++;
			
		}
		System.out.println(fact);
	}
	void multi()
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
				int a=1;
				{
					while(a<=12) {
					
		System.out.println(a+"*"+b+"="+(a*b));
		a++;}
				}
	}
public static void main(String[] args) 
{
	System.out.println("1:Factorial of a number\n2:Multiplication Table");
	System.out.println("Please enter the option:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	Multiloop ab=new Multiloop();
switch(a)
{
case 1:

	ab.fact();
	break;
case 2:
	ab.multi();
	break;
	default:
		System.out.println("Invalid Option");
		break;
}

}
}
