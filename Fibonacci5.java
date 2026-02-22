import java.util.Scanner;
class Fibonacci5 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		int temp=no,rev=0;
		while(temp!=0){
			rev=rev*10+temp%10;
			temp/=10;
		}
		if(rev==no){
			int n1=0,n2=1,ans;
			while(true){
				if(n1==no){System.out.println("it is fibonacci palindrome");break;}
				else if(n1>no) {System.out.println("it is palindrome but not fibonacci");break;}
				else{
					ans=n1+n2;
					n1=n2;
					n2=ans;
				}
				
		}
	}
	else System.out.println("not a palindrome");
	
	}
}