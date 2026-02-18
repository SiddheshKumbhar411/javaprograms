import java.util.Scanner;
class CountFactors 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no");
		int no=sc.nextInt();
		sc.close();
		int divisor=2;
		int count=2;
		while(divisor<=no/2){
			if(no%divisor==0)count++;
			divisor++;
				}
			
			System.out.print(count);
		
	}
}
