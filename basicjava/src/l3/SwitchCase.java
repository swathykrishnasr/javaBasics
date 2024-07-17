package l3;

import java.util.Scanner;

public class SwitchCase 
{
void add()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter 2 numbers:");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("sum is "+(a+b));
}
void diff()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter 2 numbers:");
	int c=s.nextInt();
	int d=s.nextInt();
	System.out.println("difference is "+(c-d));
}
void multi() {
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter 2 numbers:");
	int e=s.nextInt();
	int f=s.nextInt();
	System.out.println("Multiplication is "+(e*f));
	
}
void div()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter 2 numbers:");
	int g=s.nextInt();
	int h=s.nextInt();
	
	if(h==0)
	{
		System.out.println("not possible");
	}
	else {
		System.out.println("div is "+(g/h));
	}
}
public static void main(String[] args) {
	System.out.println("1:Addition");
	System.out.println("2:Substraction");
	System.out.println("3:Multiply");
	System.out.println("4:Divide");
	System.out.println("Please enter a valid option:");
	Scanner s=new Scanner(System.in);
	int value=s.nextInt();
	SwitchCase sc=new SwitchCase();
	
	switch(value)
	{
	case 1: 
	sc.add();
	break;
	case 2 :
		
		sc.diff();
		break;
	case 3:
		sc.multi();
		break;
	case 4 :
		sc.div();
		break;
		default:
			System.out.println("Invalid Option");
			break;
	}
}

}
