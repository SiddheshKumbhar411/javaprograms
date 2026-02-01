import java.util.Scanner;
class Abs
	{public static void main(String[] args)
		{Scanner sc=new Scanner(System.in);
		  System.out.println("enter a no:");
		int a=sc.nextInt();
		int s=a<0?a*-1:a;
		System.out.println(s);
}}