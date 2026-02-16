import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		int reverse=0;
		while(no!=0){
			int digit=no%10;
			reverse=10*reverse+digit;
			no/=10;
		}
		System.out.println(reverse);
	}
}
