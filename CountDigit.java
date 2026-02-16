import java.util.Scanner;
class CountDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		int count=0;
		while(no>0){
			int digit=no%10;
			no/=10;
			count++;
			
		}
		System.out.println("the count of digits is: "+count);
	}
}
