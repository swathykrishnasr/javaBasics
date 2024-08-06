package string;

import java.util.Scanner;

public class Combine 
{
public static void main(String[] args) 
{
	System.out.println("Enter the string:");
	Scanner sc=new Scanner(System.in);
	String abc=sc.nextLine();
	int len=abc.length()-1;
	int count=0;
	char c=sc.next().charAt(0);
	while(len>=0)
	{
		if(abc.charAt(len)==c) 
		{
			count=abc.charAt(len);
			System.out.println(count+abc.charAt(0));
			
		}
		else {
			System.out.println("cannot convert");
		}
		len--;
	}
	
}
}
