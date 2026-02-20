import java.util.Scanner;
class Fibonacci1 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int n=sc.nextInt();
		int n1=0,n2=1,ans;
		while(true){
			ans=n1+n2;
			if(n1==n){System.out.println("it is fibonacci no");break;}
			else if(n1>n){System.out.println("it is not a fibonacci no");break;}
			else{n1=n2;
				 n2=ans;}
		}
	}
}
