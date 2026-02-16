import java.util.Scanner;
class EvenOdd
	{ public static void main(String[] args)
		{ Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a no:");
		    int a=sc.nextInt();
		    String s=a%2==0?"it is even":"it is odd";
		    System.out.println(s);
		}
	}	