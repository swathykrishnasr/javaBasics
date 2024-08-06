package problem;

import java.util.Scanner;

public class Decisionmaking
{
public static void main(String[] args)
{
	System.out.println("enter the first number:");
	Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println("enter the second number:");
			int y=sc.nextInt();
	
	
	int sum=x+y;
	if(sum>20) {
		System.out.println(sum+" is greater than 20");
	}
	else {
		System.out.println("20 is greater");
	}
}
}
