package problem;

public class String_to_Array 
{
	public static void main(String[] args)
	{
		String s="Swathy Krishna S R";
		 char[] ch=new char[s.length()];
		 for(int i=0;i<s.length();i++)
		 {
			 ch[i]=s.charAt(i);
		 }
	
		 for(char c:ch) 
			{
				System.out.println(c);
			}
	
	
	
	}
 
}
