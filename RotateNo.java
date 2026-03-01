import java.util.Scanner;
class RotateNo 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no=sc.nextInt(),ct=0;
		for(int i=no;i!=0;i/=10)
		{
			ct++;
		}
		int pow=1;
		for(int j=0;j<(ct-1);j++)
		{
			pow*=10;
		}
		while(ct!=0)
		{
			no=(no%10)*pow+(no/=10);
			System.out.println(no);
			ct--;
		}
	}
}
