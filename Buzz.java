import java.util.Scanner;
class Buzz 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		if(no%7==0||no%10==7)System.out.println("it's a buzz no");
		else System.out.println("it's not a buzz no");
	}
}
