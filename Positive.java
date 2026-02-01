import java.util.Scanner;
class Positive{
		public static void main(String[] args)
		{ Scanner sc=new Scanner(System.in);
		  System.out.println("enter a number:");
		  int a=sc.nextInt();
		  String s=a>0?"it is positive":"it is negative";
			System.out.println(s);}}