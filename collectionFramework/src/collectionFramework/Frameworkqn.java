package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Frameworkqn
{
	static ArrayList list=new ArrayList();
	static void addList()
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Element to be add:");
	list.add(sc.nextLine());
	list.add(sc.nextInt());
	list.add(sc.nextBoolean());
	list.add(sc.next().charAt(0));
	System.out.println(list);

	}
	static void viewList()
	{
		
		System.out.println(+addlist());
		
	}
	static void deleteList()
	{
		
	}
	static void size()
	{
		
	}
	static void search()
	{
		
	}
	static void Exit()
	{
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("1:Add\n2:View\n3:Delete\n4:Size\n5:Search\n6:Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the option:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			addList();
			break;
		case 2:
			viewList();
			break;
		case 3:
			deleteList();
			break;
		case 4:
			size();
			break;
		case 5:
			search();
			break;
		case 6:
			Exit();
			break;
			
		}
	}
}
