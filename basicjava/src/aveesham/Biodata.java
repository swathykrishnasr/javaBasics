package aveesham;

public class Biodata 
{
	 void personal()
{
	System.out.println("Name: Swathy Krishna S R");
	System.out.println("Fathers name: N Radhakrishnan Nair");
	System.out.println("Mothers name: Sandhya R G");
	System.out.println("DOB: 11/01/2002");
	System.out.println("Adress:Dayabhavan,Puthusserikonam,Ezhukone p o,Kollam,691505");
}
	void education()
	{
	System.out.println("Qualification: B.Tect");
	System.out.println("College: College of Engineering Pathanapuram");
	System.out.println("Year of passing: 2024");
	}
public static void main(String[] args)
{
	Biodata a=new Biodata();
	a.personal();
	a.education();
}
}
