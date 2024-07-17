package l3;

import java.util.Scanner;

public class Loop
{
public static void main(String[] args) 
{
	int b=1;
	
	System.out.println("Please enter the limit:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	while(b<a+1)
	{
		System.out.println(b);
		b++;
	}
}
}
