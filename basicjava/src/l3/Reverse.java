package l3;

import java.util.Scanner;

public class Reverse 
{
public static void main(String[] args)
{
	System.out.println("Enter a msg:");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int len=name.length()-1;
while(len>=0)
{
	System.out.print(name.charAt(len));
	len--;
}
}
}
