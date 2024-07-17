package l3;

import java.util.Scanner;

public class Sc 
{
	 void largerNumber() 
	 {
		 
		 System.out.println("enter the first number:");
		 Scanner a=new Scanner(System.in);
		 int b=a.nextInt();
		 System.out.println("enter the second number");
		 int c=a.nextInt();
		 System.out.println("enter the third number:");
		 int d=a.nextInt();
		 if(b>c&&b>d)
		 {
			 System.out.println("largest number is "+b);
		 }
		 else if(c>b&&c>d)
		 {
			 System.out.println("largest number is "+c); 
		 }
		 else 
		 {
			 System.out.println("largest number is "+d);
		 }
	 
	
	 
	}
	 void checkNumber()
	 {
		 System.out.println("enter the  number:");
		 Scanner a=new Scanner(System.in);
		 int b=a.nextInt(); 
		 if(b%2==0)
		 {
			 System.out.println(b+" is even");
		 }
		 else {
			 System.out.println(b+" is odd " );
		 }
	 }
		 void multiplicationTable()
		 {
			 System.out.println("enter the  number:");
			 Scanner a=new Scanner(System.in);
			 int b=a.nextInt(); 
			 int c=1;
			 System.out.println(c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				System.out.println(++c+"*"+b+"="+(b*c));
				
		 }
	 public static void main(String[] args) {
		 System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("enter the option:");
		 Scanner s=new Scanner(System.in);
		 int value=s.nextInt();
		 Sc sc=new Sc();
		switch(value)
		{
		 case 1:
			 sc.largerNumber();
			 break;
		 case 2:
			 sc.checkNumber();
			 break;
		 case 3:
			 sc.multiplicationTable();
			 break;
			 default :
				 System.out.println("Invalid Option");
				 break;
		}
		
			 
	}
}
