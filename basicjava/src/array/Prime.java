package array;

public class Prime 
{
 int checkPrime(int x)
 {
	 int temp=0;
	 for(int i=2;i<=x/2;i++)
		{
			if(x%i==0) 
		     {
			temp=1;
             }
		}
	 return temp;
			
			


 }
	public static void main(String[] args)
	{
		int[] arr= {2,3,5,7,10};
		Prime p=new Prime();
		for(int i=0;i<=arr.length-1;i++)
		{
			int result=p.checkPrime(arr[i]);
			if(result==1) {
				System.out.println(arr[i]+" not a prime");
			}
			else 
			{
				System.out.println(arr[i]+" is prime");	
			}
			
		}
	}


}
