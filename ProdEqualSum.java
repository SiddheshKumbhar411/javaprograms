import java.util.Scanner;
class ProdEqualSum 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		sc.close();
		int add=0;
		int prod=1;
		while(no>0){
			int result=no%10;
			add+=result;
			prod*=result;
			no/=10;
		}
		if(add==prod) System.out.println("prod and sum is equal");
		else System.out.println("prod and sum are not equal");
		
	}
}
