import java.util.Scanner;
class SumDigit
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		sc.close();
		int add=0;
		while(no>0){
			int result=no%10;
			add+=result;
			no/=10;
		}
		System.out.println(add);
	}
}
