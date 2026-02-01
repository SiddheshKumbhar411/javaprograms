import java.util.Scanner;
class CheckTypeChar{
			public static void main(String[] args)
				{   Scanner sc=new Scanner(System.in);
					System.out.println("enter a char:");
					char ch=sc.next().charAt(0);
			String s=(ch>=65&&ch<=90||ch>=97&&ch<=122)?(ch>=65&&ch<=90?"upper case alphabet":"lower case alphabet"):(ch>=48&&ch<=57?"it is digit":"it is a special character");
					System.out.println(s);
				}
			}









