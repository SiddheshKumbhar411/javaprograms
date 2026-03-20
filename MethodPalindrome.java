import java.util.Scanner;
class MethodPalindrome 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no:");
		int n=sc.nextInt();
		System.out.println((n==isPalindrome(n))?"it is palindrome no":"it is not a palindrome");
		
	}
	public static int isPalindrome(int num)
	{	int rev=0;
		while(num!=0){
		rev=rev*10+num%10;
		num/=10;
		}
		return rev;
			
	}
}
