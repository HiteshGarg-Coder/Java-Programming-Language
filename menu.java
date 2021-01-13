import java.util.*;

Class contact
{
	string name;
	string number;
	string dob;
	public static void newcontact(string n,string num,string db)
	{
		name=n;
		number=num;
		dob=db;
	}
}

public class menu
{

	contact obj ;
	
	public static void Main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println(" ** contact menu ** ");
		System.out.println("Enter the name of user");

		string nam=sc.nextline();
		System.out.println("Enter the phone no.:);

		string nu=sc.nextline();
		System.out.println("Enter the date of birth in yyyy/mm/dd format:");

		string da=sc.nextline();
		obj.newcontact(nam,nu,da);
	}	
}

