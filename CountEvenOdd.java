import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		int n=no;
		int evenCount=0;
		int oddCount=0;
		while(n>0){
			int digit=n%10;
			if(digit%2==0){evenCount++;}
			else if(digit%2!=0){oddCount++;}
			//else{oddCount++;}
			n/=10;
			sc.close();
		}
		System.out.println("The number "+no+" has "+evenCount+" even digits and "+oddCount+" odd digits.");
	}
}
 