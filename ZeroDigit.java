import java.util.Scanner;
class ZeroDigit 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		int count=0;
		
			while(no>0){
			int digit=no%10;
			if(digit==0){count++;}
			no/=10;
		}
		if(count>0){System.out.println("number contains zero with count of: "+count);}
		else{System.out.println("number has no zeros in it ");
									}
	}
}
