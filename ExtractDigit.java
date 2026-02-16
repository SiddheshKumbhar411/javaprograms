import java.util.Scanner;
class ExtractDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no:");
		int no=sc.nextInt();
		int digit;
		while(no>0){
			digit=no%10;
			System.out.println(digit);
			no/=10;
		}
	}
}
