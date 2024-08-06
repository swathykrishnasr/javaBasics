package problem;

import java.util.Scanner;

public class Limitfor 
{
public static void main(String[] args)
{
	System.out.println("Enter the limit:");
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	int found=0;
	for(int i=1;i<=a;i++) {
		
	if(i%3==0) {
			System.out.println(i);
			count++;	
	}
	
	else if(i%5==0) {
		System.out.println(i);
		found++;
	}
		
	
		
	}
	System.out.println(count+" divisible by of 3");
	System.out.println(found+" divisible by of 5");
	
}
}
