import java.util.Scanner;
class Perfectno
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no");
		int no=sc.nextInt();
		sc.close();
		int divisor=1,sum=0;
		
		while(divisor<=no/2){
			if(no%divisor==0)sum+=divisor;
			divisor++;
				}
			
			if(sum==no)System.out.println("it is perfect no");
			else System.out.println("it's not perfect no");
		
	}
}
