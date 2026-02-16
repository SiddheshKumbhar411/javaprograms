import java.util.Scanner;
class TempConversion
{     public static void main(String[] args)
	{ Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in celcius:");
		double temp=sc.nextDouble();
		final double fahrenheit=(9.0/5)*temp+32;
		System.out.printf("temperature in Fahrenheit: %.1f",fahrenheit);
	}
}