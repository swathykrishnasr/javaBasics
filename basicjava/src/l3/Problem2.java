package l3;

import java.util.Scanner;

public class Problem2 {
	void palindrome()
	{
		System.out.println("Enter the number:");
		Scanner ab=new Scanner(System.in);
		int num=ab.nextInt();
		int rev=0,rem=0;
		int a=num;
		while(num>0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	
		}
		if(a==rev)
		{
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	void multiplicationTable() 
	{

	}
	void conversion()
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		while(a>0)
		{
			
		
		
		
		if(a%2==0) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
		a=a/2;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("1: Palindrome\n2: Multiplication Table\n3: Conversion");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Problem2 s=new Problem2();
		
		switch(a)
		{
		case 1:
			s.palindrome();
			break;
		case 2:
			break;
		case 3:
			s.conversion();
			break;
			default:
				System.out.println("Invalid OPTION");
		}
	}

}
