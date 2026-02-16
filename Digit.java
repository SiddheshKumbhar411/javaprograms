import java.util.Scanner;
class Digit
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a character:");
			char ch=sc.next().charAt(0);
			String s=(ch>=48&&ch<=57)?"it is a digit":"it is not a digit";
			System.out.println(s);
		}
	}