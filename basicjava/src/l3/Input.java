package l3;

import java.util.Scanner;

public class Input 
{

	void addNumber() 
	{
	System.out.println("enter the first number:");
    Scanner a=new Scanner(System.in);
    int b=a.nextInt();
    System.out.println("enter the second number:");
    int c=a.nextInt();
    System.out.println("sum is "+(b+c));
	}
    public static void main(String[] args) 
    {
    	Input add=new Input();
    	add.addNumber();
    	
	}

}
