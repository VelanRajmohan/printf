import java.util.*;
public class printf
{
	public static void main(String[] args)
	{
		System.out.printf("%65s","Number of items purchased: ");
		System.out.printf("%10d", 15);
		System.out.println();
		System.out.printf("%65s","Subtotal: ");
		System.out.printf("%10.2f", 142.18);
		System.out.println();
		System.out.printf("%65s","Tax: ");
		System.out.printf("%10.2f", 5.66);
		System.out.println();
		System.out.printf("%75s","------");
		System.out.println();
		System.out.printf("%65s","Total: ");
		System.out.printf("%10s","$147.84");
		System.out.println();
		System.out.println();
		System.out.printf("%65s","Gas points earned: ");
		System.out.printf("%10d", 100);
		System.out.println();
	}
}