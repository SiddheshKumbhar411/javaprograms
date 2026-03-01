import java.util.Scanner;
class ReverseSecondHalf 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no ");
		int no=sc.nextInt(),ct=0;
		for(int i=no;i!=0;i/=10)
		{
			ct++;
		}
		if(ct%2==0)
		{
			int pow=1;
			for(int j=0;j<ct/2;j++)
			{
				pow*=10;
			}
			int lastHalf=no%pow;
			no/=pow;
			while(lastHalf!=0)
			{
				no=no*10+lastHalf%10;
				lastHalf/=10;
			}
			System.out.println(no);
		}
		else{System.out.println("it can't be done due to odd count of digit");}
	}
}
