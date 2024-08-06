package problem;

public class Arrpalindrome 
{
	 static void pal(int a)
	 {
		int temp=a;
		int rev=0,rem=0;
		while(a>0)
		{
		
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			if(rev==temp)
			{
				System.out.println(temp+ " is palindrome");
			}
		
		
		}			
	 }
	 
	
	public static void main(String[] args) 
	{
		int[] arr= {101,20,12,18,30};
		int i=0;
		while(i<arr.length) 
		{
			pal(arr[i]);
			i++;
		}
		
	
	
				
	}
}
