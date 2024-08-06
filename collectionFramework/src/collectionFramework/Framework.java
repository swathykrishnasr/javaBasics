package collectionFramework;

import java.util.ArrayList;

public class Framework 
{
	public static void main(String[] args) 
	{
	 ArrayList list=new ArrayList();
	 list.add("Swathy");
	 list.add(11);
	 list.add(true);
	 list.add('K');
	 System.out.println(list);
	 System.out.println(list.remove(3));
	 System.out.println(list);
	 System.out.println(list.get(0));
	}
}
