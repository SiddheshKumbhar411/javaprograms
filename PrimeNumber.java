import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		int divisor=2;
		//int divisor=1;
		//int count=1;
		while(divisor<=no/2){
			if(no%divisor==0) break;
			//if(no%divisor==0) count++;
			divisor++;
		}
		//if (count==2)System.out.println("it is prime");
		//else System.out.println("it is not a prime");
		if(divisor==no)System.out.println("it is a prime no");
		else System.out.println("it is not a prime no");
	}
}
