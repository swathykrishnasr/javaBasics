package string;

import java.util.Scanner;

public class Limit 
{
public static void main(String[] args) 
{
	System.out.println("Enter the limit:");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	int count=0;
	
	for(int i=1;i<=limit;i++)
	{
		if(i%10==0)
		{
		count++;
		System.out.println(i);
		}
	
	}
	System.out.println(count);

}
}
