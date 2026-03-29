import java.util.Scanner;
class MethodMovieTheatre 
{
	public static void main(String[] args) 
	{
		isMovieCalculation();
	}
	public static void isMovieCalculation()
	{	int ctOdd=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count of ticket:");
		int count=sc.nextInt();
		int temp=count;
		while(count>0)
		{
			int price=isPrice();
	
			if(price%2!=0)
			{
				sum+=price;
					ctOdd++;
			}
			count--;
		}
		if(ctOdd>0){
		double average=(double)sum/ctOdd;
		System.out.println("total count of ticket:"+ temp);
		System.out.println("odd count of ticket:"+ ctOdd);
		System.out.println("Average"+average);
		}
		else{
			System.out.println("no Odd ticket");
		}
		
	}
	public static int isPrice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price");
		int price=sc.nextInt();
		return price;
	}
}
