package string;

import java.util.Scanner;

public class Strings 
{
	public static void main(String[] args) {
		
	// method1
String name = new String("swathy");

System.out.println(name);
// method2
String nam="Krishna";
System.out.println(nam);
System.out.println(name.toUpperCase() +" "+ nam.toUpperCase());
//dynamic
System.out.println("enter your name:");
Scanner a=new Scanner(System.in);
String name1;
name1=a.nextLine();
String m="Hello";
System.out.println(m+" "+name1);

	}
	
}
