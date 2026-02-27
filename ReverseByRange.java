import java.util.Scanner;
class ReverseByRange 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the start value");
		int start=sc.nextInt();
		System.out.print("enter the end  value");
		int end=sc.nextInt();
		while(end<=start)
		{
			int rev=0;
			for(int n=start;n!=0;n/=10)
			{
				rev=rev*10+n%10;
			}
			System.out.println(rev);
			start--;
		}
		
	}
}
