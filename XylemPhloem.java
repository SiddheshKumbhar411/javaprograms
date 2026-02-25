import java.util.Scanner;
class XylemPhloem 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		int endOfNum=no%10;
		no/=10;
		int midOfNum=0;
		while(no>9)
		{
			midOfNum+=no%10;
			no/=10;
		}
		endOfNum+=no%10;
		if(endOfNum==midOfNum){System.out.println("it is xylem no");}
		else{System.out.println("it is phloem no");}
	}
}




