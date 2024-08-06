package string;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String pal=sc.nextLine();
		int len=pal.length()-1;
		String rev="";
		while(len>=0)
		{
			rev=rev+pal.charAt(len);
			len--;
		}
		System.out.println(rev);
			if(pal.equals(rev))
			{
				System.out.println("is palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
			
	
				
		}
		
	}
