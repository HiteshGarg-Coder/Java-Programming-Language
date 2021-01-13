enum adhar
{	nbr;
	int nb;
	adhar(int nb){
		this.nb=nb;
	}
	adhar(){
		nb=0;
	}
}

public class person
{
	adhar obj;
	person(int nb){
		obj.nbr.nb=nb;
	}
	public static void main(String[] args) {
		person p1 = new person(123);
		person p2 = new person(789);
		System.out.println(p1.obj.nbr.nb);
		System.out.println(p2.obj.nbr.nb);
	}
}