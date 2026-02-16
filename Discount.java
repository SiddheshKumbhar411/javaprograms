import java.util.Scanner;
class Discount 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE BILLING AMMOUNT:");
		double a=sc.nextDouble();
		if(a>299) a*=0.8;
		System.out.print("TOTAL BILLING AMOUNT:"+a);
		
	}
}
