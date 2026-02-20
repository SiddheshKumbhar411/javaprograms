import java.util.Scanner;
class Fibonacci3 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the start value: ");
		int start=sc.nextInt();
		System.out.print("enter the end value: ");
		int end=sc.nextInt();
		
		if(start<end){
			int n1=0,n2=1,ans,count=0;
			while(n1<=end){
				ans=n1+n2;
				if(n1>=start){ count++; }
				n1=n2;
				n2=ans;
			}
			System.out.print(count);
			
		}
		else{System.out.println("Invalid Input");}
	}
}
