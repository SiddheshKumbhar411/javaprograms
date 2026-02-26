import java.util.Scanner;
class StrongNo
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no");
		int no=sc.nextInt();
		int temp=no,sum=0;
		while(temp!=0)
		{
			int digit=temp%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
		     sum+=fact;
			temp/=10;
		}
		if(sum==no){
		System.out.println("it is a strong no");}
		else{System.out.println("it is not a Strong no");}
	}
}
