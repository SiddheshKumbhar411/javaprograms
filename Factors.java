import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no");
		int no=sc.nextInt();
		sc.close();
		int divisor=1;
		while(divisor<=no/2){
			if(no%divisor==0)System.out.println(divisor);
			divisor++;}
			/*for(;divisor<=no/2;){
				if(no%divisor==0)System.out.println(divisor);
				divisor++;*/
			
		}
	}
}
