package l3;

import java.util.Scanner;

public class Found
{
public static void main(String[] args) 
{
	System.out.println("Enter a msg:");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int len=name.length()-1;
	int found=0;

while(len>=0)

{
	if(name.charAt(len)=='w'||name.charAt(len)=='W') 
	{
		found=name.charAt(len);
		System.out.println("is found");
	}
	
	len--;
	
}


}
}