import java.util.Scanner;
class SpecialChar{
		   public static void main(String[] args)
			{
			   Scanner sc=new Scanner(System.in);
			   System.out.println("enter a character:");
			   char ch=sc.next().charAt(0);
			   String s=(ch>=65&&ch<=90||ch>=97&&ch<=122)?"it is not a special char":(ch>=48&&ch<=57?"it is not a spl char":"it is spl char");
				System.out.println(s);
}}
		           
			   