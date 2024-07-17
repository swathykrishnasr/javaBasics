package string;

public class Contains 
{
public static void main(String[] args) 
{
	// contains
	String a=" Swathy Krishna S R ";
	String b="";
	String c="Swa";
	String d="Swa";
	System.out.println(a.contains("Swathy"));
	System.out.println(a.contains("lux"));
	// isEmpty
	System.out.println(a.isEmpty());
	System.out.println(b.isEmpty());
	// replace
	System.out.println(a.replace('a','m'));
	// trim
	System.out.println(a.trim());
	// uppercase
	System.out.println(a.toUpperCase());
	// lowercase
	System.out.println(a.toLowerCase());
	//equals
	System.out.println(c.equalsIgnoreCase(a	));
	System.out.println(c.equalsIgnoreCase(d));
	// split
	System.out.println(a.substring(3,4));
}
}
