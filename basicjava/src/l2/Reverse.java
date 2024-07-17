package l2;

public class Reverse {
	public static void main(String[] args) {
		
	
	int a=42;
	int rev=0;
	int rem=a%10;
	rev=rem+rev*10;
	int q=a/10;
	rev=q+rev*10;
	System.out.println("Reverse is " + rev);
	}
}
