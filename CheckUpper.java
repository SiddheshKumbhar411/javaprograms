import java.util.Scanner;
class CheckUpper{
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a character:");
				char ch=sc.next().charAt(0);
				String s=(ch>=65&&ch<=90||ch>=97&&ch<=122)?(ch>=65&&ch<=90?"it is an upper case":"it is lower case"):"it is not a alphabet";
				System.out.println(s);
}}
