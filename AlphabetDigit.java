import java.util.Scanner;
class AlphabetDigit{
			public static void main(String[] args)
			{    Scanner sc=new Scanner(System.in);
				
				System.out.println("enter a character:");
				char ch=sc.next().charAt(0);
				String s=(ch>=65&&ch<=90||ch>=97&&ch<=122)?"it is a alphabet":(ch>=48&&ch<=57?"it is a digit":"it is neither alphabet nor digit");
				System.out.println(""+s);}}
				