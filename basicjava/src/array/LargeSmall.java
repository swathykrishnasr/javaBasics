package array;

public class LargeSmall 
{
	 
	public static void main(String[] args)
	{
		int [] arr= {10,5,3,20,25};
		int temp=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	
		}
		sum=arr[0]+arr[arr.length-1];
		System.out.println("sum is "+sum);
	}
  
}
