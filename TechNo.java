import java.util.Scanner;
class TechNo
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no ");
		int no=sc.nextInt();
		int ct=0;
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
			int firstHalf=no/pow;
			int total=lastHalf+firstHalf;
			if(total*total==no){System.out.println("it is techno");}
			else{System.out.println("it is not a techno");}
		}
		else{System.out.println("it is not a techno");}
	}
}
