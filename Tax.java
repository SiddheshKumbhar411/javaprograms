import java.util.Scanner;
class Tax 
{
	public static void main(String[] args) 
	{
		System.out.println("******WELCOME TO TAX CALCULATION*****");
			Scanner sc=new Scanner(System.in);
			System.out.print("ENTER YOUR MONTHLY SALARY:");
			double a=sc.nextDouble();
			if (a*12<=7_00_000) System.out.println("NO TAX ON YOUR SALARY");
			else if (a*12>7_00_000&&a*12<9_00_000)  System.out.print("TAX DEDUCTION AMOUNT IS:"+ (a*=0.14));
			else if(a*12>9_00_000&&a*12<12_00_000) System.out.print("TAX DEDUCTION AMOUNT IS:"+ (a*=0.15));
			else if(a*12>12_00_000&&a*12<15_00_000) System.out.print("TAX DEDUCTION AMOUNT IS:"+(a*=0.2));
			else if(a*12>15_00_000&&a*12<20_00_000)  System.out.print("TAX DEDUCTION AMOUNT IS:"+(a*=0.25));
			else System.out.print("TAX DEDUCTION AMOUNT IS:"+(a*=0.3));
				}
}
