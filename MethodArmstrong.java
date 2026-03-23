import java.util.Scanner;
class MethodArmstrong
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no");
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
	}
	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int power(int base,int raise)
	{
		int result=1;
		while(raise>0)
		{
			result*=base;
			raise--;
		}
		return result;
	}
	public static int extract(int num)
	{
		int sum=0;
		int digit=count(num);
		while(num!=0)
		{
			int last =num%10;
			sum+=power(last,digit);
			num/=10;
		}
		return sum;
	}
	public static  boolean isArmstrong(int num)
	{
		if(num==extract(num))
		{
			return true;
		}
		else{
			return false;
		}
	}
}
