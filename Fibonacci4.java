import java.util.Scanner;
class Fibonacci4 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		while(no!=0){
			int digit=no%10;
			no/=10;
			int n1=0,n2=1,ans;
			while(true){
				if(n1==digit){System.out.println("it is fibo"+digit); break;}
				else if(n1>digit)break;//System.out.println("it is not fibo"+digit);break;}
				else{
					ans=n1+n2;
					n1=n2;
					n2=ans;
				}
			}
		}
	}
}
