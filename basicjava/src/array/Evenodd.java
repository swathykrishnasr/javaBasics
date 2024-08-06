package array;

public class Evenodd
{
public static void main(String[] args)
{
  int[] arr= {10,20,21,30,41,50};
  for(int i=0;i<arr.length;i++)
  {
   oddEven(arr[i]); 
  }
}
 static void oddEven(int a)
{
	if(a%2==0)
	{
		System.out.println("square is "+a*a);
	}
	else 
	{
		System.out.println("cube is "+a*a*a);
	}
}
}
