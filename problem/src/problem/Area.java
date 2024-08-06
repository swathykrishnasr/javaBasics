package problem;

import java.util.Scanner;

public class Area 
{
	void area()
	{
		System.out.println("Enter the radius:");
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		double pi=3.14;
		double area=r*r*pi;
		System.out.println("Area is "+area);
	}
	void area(int h,int b)
	{
	double area=b*h;
	System.out.println("Area is "+area);	
	}
	void area(float h,float b)
	{
		double half=0.5;
		double area=half*b*h;
		System.out.println("Area is "+area);
	}
	 public static void main(String[] args) 
	 {
	System.out.println("1: Area of circle\n2: Area of rectangle\n3: Area of triangle");
	System.out.println("Please enter the option:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	Area ar=new Area();
	System.out.println("Enter the height:");
	int height=sc.nextInt();
	System.out.println("Enter the breadth:");
	int breadth=sc.nextInt();
	System.out.println("Enter the height:");
	float he=sc.nextInt();
	System.out.println("Enter the breadth:");
	float b=sc.nextInt();
	
	switch(a)
	{
	case 1:
		ar.area();
		break;
	case 2:
		ar.area(height, breadth);
		break;
	case 3:
		ar.area(he, b);
		break;
	default :
		System.out.println("INVALID OPTION");
		
		break;
	}
	 }
}
