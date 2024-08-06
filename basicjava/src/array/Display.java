package array;

import java.util.Scanner;

public class Display 
{
	static void oddEven(int a )
	{
		
		int sum=0;
		if(a%2==0)
		{
			
		
		}
		
		
		
	}
	 public static void main(String[] args) 
	 {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the array elements:");
	
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
		for(int i=0;i<n;i++)
		{
			
			oddEven(arr[i]);
		}
			
		
	
	
	 }
}
