import java.util.Scanner;
class PalindromeByRange 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start value ");
		int start=sc.nextInt();
		System.out.print("Enter the end value ");
		int end=sc.nextInt();
		int no=start,rev=0;
		while(no>=start||start>end)
		{
			if(no<=end)
			{
				int temp=no;rev=0;
				while(temp!=0)
				{
					
					rev=rev*10+temp%10;
					temp/=10;
				}
				if(no==rev){System.out.println(no);}
				no++;
			}
			else{break;}
		}
		
	}
}
