import java.util.Scanner;
class NeonByRange 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the start value: ");
		int start=sc.nextInt();
		System.out.print("enter the end value: ");
		int end=sc.nextInt();
		 
		while(start<=end)
		{
			int temp=start*start,sum=0;
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
			
			if(sum==start){System.out.println(start);}
			start++;
			//System.out.println(start);
		}
		
	}
}
