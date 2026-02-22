import java.util.Scanner;
class Fibonacci6 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no ");
		int no=sc.nextInt();//3
		int n1=0,n2=1,ans;
		while(true){
			if(n1==no){
				/*if(n1==0){System.out.println(" it is fibonacci but not prime"); return; }*/
				int div=2;
				while(div<=no/2||n1==0){
					if(no%div==0){System.out.println(" it is fibonacci but not prime"); return;}
					div++;
				}
				if(div>no/2){
					System.out.println("it is prime as well as fibonacci");break;
				}
			}
			else if(n1>no){System.out.println("not a fibonacci no");break;}
			else{
				ans=n1+n2;
				n1=n2;
				n2=ans;
			}
		}
	}
}
