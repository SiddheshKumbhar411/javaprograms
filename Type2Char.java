import java.util.Scanner;
class Type2Char
{
  	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a char:");
			char ch=sc.next().charAt(0);
			 if(ch>=65&&ch<=90){
						System.out.println("it is upper case");
					  }
			else if(ch>=97&&ch<=122)
				{
					
					System.out.println("it is lower case");
				}
			else if(ch>=48&&ch<=57)
				{
					System.out.println("it is digit");
				}
			else 
			{	System.out.println("it is special Character");
			}
		}
}

