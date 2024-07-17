package l2;

public class Operators {


int a=200,b=100;
	void addNumber()
	{
		System.out.println("the result:"+(a+b));
		
	}
	void subNumber()
	{
		System.out.println("the result:"+(a-b));
	}
	void multiNumber()
	{
		System.out.println("the result:"+(a*b));
	}
	void divNumber()
	{
		System.out.println("the result:"+(a/b));
	}
	void modNumber()
	{
		System.out.println("the result:"+(a%b));
	}
	
		public static void main(String[] args) {
			
		
		Operators a=new Operators();
		a.addNumber();
		a.subNumber();
		a.multiNumber();
		a.divNumber();
		a.modNumber();
			
	}

}
