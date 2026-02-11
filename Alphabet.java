import java.util.Scanner;
class Alphabet
	{
	  public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a character:");
			char ch=sc.next().charAt(0);
			 String op=((ch>='A' &&ch<='Z')||(ch>='a' && ch<='z'))?(ch +" it is an alphabet"):(ch+" it is not an alphabet");
			System.out.println(op);
}}