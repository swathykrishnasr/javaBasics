package problem;

import java.util.Scanner;

public class Divisible_if 
{
public static void main(String[] args) 
{
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%3==0&&a%6==0&&a%9==0) {
	System.out.println(a+" is divisible by 3,6,9");
}
else if(a%3==0&&a%6==0) {
	System.out.println(a+" is divisible by 3,6");
}
else if(a%3==0) {
	System.out.println(a+" is divisible by 3");
}
else if(a%6==0) {
	System.out.println(a+" is divisible by 6");
}
else if(a%9==0) {
	System.out.println(a+" is divisible by 9");
}
else {
	System.out.println("not divisible");
}
}
}
