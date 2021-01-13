class VariableDemo
{
	int x;
	static int y;

	public static void main(String [] rk)
	{

		System.out.println("Value of x in main" +y);
		VariableDemo obj = new VariableDemo();

		System.out.println("Value of x" +obj.x);
		obj.demo();
	}
	
	void demo()
	{
		int x ;
		x=100;

		System.out.println("Value of x" +x);
		System.out.println("Value of x" +this.x);
	}
}