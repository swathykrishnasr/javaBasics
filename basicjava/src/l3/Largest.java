package l3;

import java.util.Scanner;

public class Largest {
	
	 void checkNumber() 
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
	 public static void main(String[] args) {
		Largest a=new Largest();
		a.checkNumber();
	}

}
