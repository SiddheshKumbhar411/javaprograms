import java.util.Scanner;
class RotateNoPrime
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
			int deno=2;
			while(deno<=no/2)
			{
				if(no%deno==0){break;}
				deno++;
			}
			if(deno>no/2){System.out.println(no+" is prime"); }
			//else{System.out.println(no+"no rotation is prime");}
			ct--;
		}
	}
}
