import java.util.*;

class Stringdemo
{
	static public void main(String [] rk)
	{
		String s1 ="Hello";
		String s2 =new String("Hello");
		String s3 = new String("Hello");
		//String s4 =s3.toUpper("Hello");

		System.out.println("s1==s2 is " + s1==s2);
		System.out.println("s2==s3 is "  + s2==s3);
	}
}