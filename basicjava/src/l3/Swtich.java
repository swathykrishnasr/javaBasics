package l3;

import java.util.Scanner;

public class Swtich 
{
public static void main(String[] args) {
	System.out.println("1:Addition");
	System.out.println("2:Substraction");
	System.out.println("3:Multiply");
	System.out.println("4:Divide");
	System.out.println("Please enter a valid option:");
	Scanner s=new Scanner(System.in);
	int value=s.nextInt();
	switch(value=2)
	{
	case 1:
		System.out.println("Please enter 2 numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum is "+(a+b));
		break;
	case 2:
		System.out.println("Please enter 2 numbers:");
		int c=s.nextInt();
		int d=s.nextInt();
		System.out.println("difference is "+(c-d));
		break;
	case 3:
		System.out.println("Please enter 2 numbers:");
		int e=s.nextInt();
		int f=s.nextInt();
		System.out.println("Multiplication is "+(e*f));
		break;
	case 4:
		System.out.println("Please enter 2 numbers:");
		int g=s.nextInt();
		int h=s.nextInt();
		System.out.println("sum is "+(g/h));
		break;
		default:
			System.out.println("Invalid Option");
			break;
	}
}

}
