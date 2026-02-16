import java.util.Scanner;
class EvenDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		while(no>0){
			int digit=no%10;
			if(digit%2==0||digit==0){System.out.println(digit);}
			no/=10;
		}
	}
}
