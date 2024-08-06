package string;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) 
	{
	String name="Swathy Krishna S R";
	char a='a';
	int count=0;
	int len=name.length();
	while(len>0)
	{
		if(name.charAt(len-1)==a)
		{
			count++;
		}
		len--;
	}
	System.out.println(count);
	//Dynamic
	System.out.println("Enter the String:");
	Scanner sc=new Scanner(System.in);
	String ab=sc.nextLine();
	char c=sc.next().charAt(0);
	int len1=ab.length();
	int cont=0,i=0;
	while(len1>0)
	{
		if(ab.charAt(len1-1)==c)
		{
			cont++;
			System.out.println("location"+(len1+1));
		}
		len1--;
	}
	System.out.println(count);
	
	}

}
