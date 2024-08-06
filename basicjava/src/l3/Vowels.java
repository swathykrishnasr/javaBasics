package l3;

import java.util.Scanner;

public class Vowels 
{
public static void main(String[] args) 
{
	System.out.println("Enter a msg:");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int len=name.length()-1;
	int count=0;
	int found=0;
	while(len>=0)
	{
		if(name.charAt(len)=='A'||name.charAt(len)=='a'||name.charAt(len)=='E'||name.charAt(len)=='e'
				||name.charAt(len)=='I'||name.charAt(len)=='i'||name.charAt(len)=='o'||name.charAt(len)=='O'||name.charAt(len)=='U'||name.charAt(len)=='u')
		{
		count ++;	
		}
		
		else {
			found++;
		}
		len--;
		
	}
	System.out.println(count+" characters are vowels");
	System.out.println(found+" characters are consants");
}


}
