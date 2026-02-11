import java.util.Scanner;
class Positive2{
		public static void main(String[] args)
		{ Scanner sc=new Scanner(System.in);
		  System.out.println("enter a number:");
		  int a=sc.nextInt();
		  String s=a>=0?(a==0?"it is zero":"it is positive"):"it is negative";
		System.out.println(s);
		}
	}