package array;

public class Square 
{
public static void main(String[] args) 
{
	int[] arr= {2,4,8,3,9,7,12};
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		temp=arr[i]*arr[i];
		for(int j=0;j<arr.length;j++) 
		{
			if(arr[j]==temp)
			{
			System.out.println(arr[i]+" : "+temp);
			}
		}
	}
}


}
