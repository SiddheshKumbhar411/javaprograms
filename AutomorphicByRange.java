import java.util.Scanner;
class AutomorphivByRange 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the start value: ");
		int start=sc.nextInt();
		System.out.print("enter the end value: ");
		int end=sc.nextInt();
		 
		while(start<=end)
		{
			int pow=1;
			for(int temp=start;temp!=0;temp/=10)
			{
				pow*=10;
			}
			int sq=start*start;
			if(sq%pow==start){System.out.println(start);}
			start++;
		}
		
	}
}
