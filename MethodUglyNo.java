import java.util.Scanner;
class MethodUglyNo
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no:");
		int n=sc.nextInt();
		System.out.println(isUgly(n));
	}
	public static boolean isUgly(int n)
	{
		while(n!=1)
		{
			if(n%2==0)
			{
				n/=2;
			}
			else if(n%3==0)
			{
				n/=3;
			}
			else if(n%5==0)
			{
				n/=5;
			}
			else{
				break;
			}
			
		}
		if(n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
