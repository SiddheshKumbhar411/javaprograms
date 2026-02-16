import java.util.Scanner;
class ProdOfDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the no: ");
		int no=sc.nextInt();
		int prod=1;
		while(no>0){
			int result=no%10;
			prod*=result;
			no/=10;
		}
		System.out.println(prod);
		
	}
}
