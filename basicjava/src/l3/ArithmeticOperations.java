package l3;

import java.util.Scanner;

public class ArithmeticOperations 
{
void addNumbers()
{
	System.out.println("Enter the first number:");
	Scanner obj1=new Scanner(System.in);
	int a=obj1.nextInt();
	System.out.println("Enter the second number:");
	int b=obj1.nextInt();
	System.out.println("Sum is "+(a+b));
	
	
}
void subNumbers()
{
	System.out.println("Enter the first number:");
	Scanner obj1=new Scanner(System.in);
	int a=obj1.nextInt();
	System.out.println("Enter the second number:");
	int b=obj1.nextInt();
	System.out.println("Difference is "+(a-b));
	
}
void multiNumber()
{
	System.out.println("Enter the first number:");
	Scanner obj1=new Scanner(System.in);
	int a=obj1.nextInt();
	System.out.println("Enter the second number:");
	int b=obj1.nextInt();
	System.out.println("Multiplication is "+(a*b));
}
void divNumber()
{
	System.out.println("Enter the first number:");
	Scanner obj1=new Scanner(System.in);
	float a=obj1.nextFloat();
	System.out.println("Enter the second number:");
	float b=obj1.nextFloat();
	System.out.println("Divison is "+(a/b));	
}
public static void main(String[] args)
{
	ArithmeticOperations ao=new ArithmeticOperations();
	ao.addNumbers();
	ao.subNumbers();
	ao.multiNumber();
	ao.divNumber();
}
}
