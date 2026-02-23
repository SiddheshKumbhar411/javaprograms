import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no ");
		int no=sc.nextInt();
		int power=1;
		for(int n=no;n!=0;n/=10){
			power*=10;
		}
		int sq=no*no;
		if(sq%power==no){System.out.println("it is a automorphic no");}
		else{System.out.println("it is a not a automorphic no");}
	}
}
