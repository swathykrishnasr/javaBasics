package string;

import java.util.Scanner;

public class Equals 
{
public static void main(String[] args)
{
	System.out.println("Enter the first string:");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	System.out.println("Enter the second string:");
	String b=sc.nextLine();
	
	if(a.equals(b))
	{
		System.out.println("is equal");
	}
	else {
		System.out.println("not equal");
	}
}
}
