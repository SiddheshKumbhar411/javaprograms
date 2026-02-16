import java.util.Scanner;
class FindDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the digit to be found: ");
		int digit=sc.nextInt();
		int num=12345678;
		int n=num;
		while(n>0){
			int last=n%10;
			if(digit==last){System.out.println("digit is found");
			return;}
			n/=10;
		}
		System.out.println("digit not found");
	}
}
