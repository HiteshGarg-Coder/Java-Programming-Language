import java.time.*;

class DateTimeDemo
{
	public static void main(String [] rk)
	{

		LocalDate d= LocalDate.now();
		System.out.println(d);
		
		LocalTime e= LocalTime.now();
		System.out.println(e);

		LocalDateTime f= LocalDateTime.now();
		System.out.println(f);

		LocalDate g= LocalDate.of(2020,01,05);
		System.out.println(g.getDayOfWeek());

		LocalDate h= LocalDate.of(1988,2,29);
		System.out.println(h);
	
		LocalDateTime i= LocalDateTime.parse("1987-02-15T00:59:59.12");
		System.out.println(i);
	}
}