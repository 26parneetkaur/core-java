import java.util.*;
class Twentyseven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("enter the year:");
		year=sc.nextInt();
		if(year % 400 == 0)
		{
		System.out.println("year is a leap year");
		}
		if(year % 100 == 0)
		{
		System.out.println("year is not a leap year");
		}
		if(year %4 == 0)
		{
		System.out.println("year is a leap year");
		}
	}
}
		