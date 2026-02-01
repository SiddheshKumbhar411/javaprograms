import java.util.Scanner;
class Alphabet2{
		public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter a character:");
			char ch=sc.next().charAt(0);
			String op=((ch>=65&&ch<=90)||(ch>=97&&ch<=122))?("it is an alphabet"):("it is not an alphabet");
			System.out.println(op);
	}
}