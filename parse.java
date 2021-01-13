import java.util.*;

class parse
{
	static
	{
		System.out.println("THIS IS STATIC BLOCK");
	}
	
	public static void main(String [] rk)
	{

		System.out.println("Enter your roll no:");
		int ro = Integer.parseInt(rk[0]);

		System.out.println("Enter your name:");
		
		//--To prevent from reading buffer
		String name = rk[12];

		System.out.println("Enter your reg no.:");
		double cgp = Double.parseDouble(rk[1]);

	}
}