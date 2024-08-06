package pattern;

import java.util.Scanner;

public class Sample
{
	 public static void main(String[] args) 
	 {
		System.out.println("Enter the number of rows:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int i,j=0;
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print(" *");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println(); 
		}
	 }
}
