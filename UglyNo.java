import java.util.Scanner;
class UglyNo 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no=sc.nextInt();
		while(no!=0)
		{
			if(no%2==0)
			{
				no/=2;
			}
			else if(no%3==0)
			{
				no/=3;
			}
			else if(no%5==0)
			{
				no/=5;
			}
			else
			{
				break;
			}
		}
		if(no==1){System.out.println("it is a ugly no");}
		else{System.out.println("it is not a ugly no");}

	}
}
