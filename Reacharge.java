import java.util.*;

class RechargeDetails{
	ArrayList<Integer> plan = new ArrayList<>();
	String phoneno = new String();
}

class Menu{

	static RechargeDetails r1 = new RechargeDetails();

	enum Plans{
		plan1(59,100,50,500),plan2(69,110,52,750);
		int price,call,sms,data;

		Plans(int p,int c,int s,int d)
		{
			price = p;
			call = c;
			sms = s;
			data = d;
		}
	}

	public static void NewPlan(){

		Scanner sc = new Scanner(System.in);
		System.out.print("enter mobile number: ");

		String numb = sc.nextLine();
		//sc.nextLine();
		//plans obj;
		System.out.println("plans :");
		int i = 1;

		for(Plans p:Plans.values()){
			System.out.println(""+i+") price: "+p.price+" call: "+p.call+" sms: "+p.sms+" data: "+p.data);
			i++;
		}

		System.out.print("slect plan: ");
		int px = sc.nextInt();

		RechargeDetails r1 = new RechargeDetails();
		r1.phoneno = new String(numb);
		r1.plan.add(px);

	}

	public static void ViewPlans(){
		for(Integer n:r1.plan ){
			switch(n){
				case 1 : 
				Plans obj = Plans.plan1;
				System.out.println("price: "+obj.price+" call: "+obj.call+" sms: "+obj.sms+" data: "+obj.data);
				break;

				case 2:
				Plans obj1 = Plans.plan2;
				System.out.println("price: "+obj1.price+" call: "+obj1.call+" sms: "+obj1.sms+" data: "+obj1.data);
				break;
			}
			//System.out.println(n);
		}
	}

	public static void RechargeMenu(){

		Scanner sc = new Scanner(System.in);

		System.out.println(" ** recharge menu ** ");
		System.out.println("1) View Activated plan");
		System.out.println("2) Select new plan");

		int choice = sc.nextInt();
		switch(choice){
			case 1:ViewPlans();
			break;

			case 2:NewPlan();
			break;

			default: RechargeMenu();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
			RechargeMenu();
	}
}