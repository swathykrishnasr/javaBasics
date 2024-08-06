package string;

import java.util.Scanner;

public class Convert
{
public static void main(String[] args) 
{
	System.out.println("Enter the String:");
	Scanner sc= new Scanner(System.in);
	String s=sc.nextLine();
	int len=s.length()-1;
	while(len>=0)
	{
		if(s.contains("ly"))
		{
System.out.println(s.replace("ly","ed"));
		}
	}
}
}
