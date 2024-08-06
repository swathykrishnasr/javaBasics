package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setcollectionframework 
{
	public static void main(String[] args)
	{	
		//TreeSet
		TreeSet set=new TreeSet();
		
		set.add("Swathy");
		set.add("Hasna");
		set.add("Midhun");
		set.add("Lekshmi");
		set.add("Nithin");
		set.add("Swathy");
		 Iterator itr=set.iterator();
		 while(itr.hasNext())  
         {  
         System.out.println(itr.next());  
         }  
			set.remove("Swathy");
			System.out.println(set);
			//HashSet
			HashSet set1=new HashSet();
			set1.add("Swathy");
			set1.add("Hasnaa");
			set1.add("Midhun");
			set1.add("Lekshmi");
			set1.add("Nithin");
			set1.add("Swathy");
			 Iterator itr1=set1.iterator();
			 	while(itr1.hasNext())  
			 	{  
			 		System.out.println(itr1.next());  
			 	}  
		 	set.remove("Swathy");
		 	System.out.println(set1);
	 	//LinkedHashSet
	 	LinkedHashSet set2=new LinkedHashSet();
	 	
		set2.add("Swathy");
		set2.add("Hasna");
		set2.add("Midhun");
		set2.add("Lekshmi");
		set2.add("Nithin");
		set2.add("Swathy");
		 Iterator itr2=set2.iterator();
		 	while(itr2.hasNext())  
		 	{  
		 		System.out.println(itr2.next());  
		 	}  
	 	set.remove("Swathy");
	 	System.out.println(set2);
	 	 
	
		
	}
}
