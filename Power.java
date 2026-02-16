import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{	Scanner sc= new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		System.out.print("enter the power: ");
		int power=sc.nextInt();
		sc.close();
		
		if(power>0){
			int result=1;
			
			while(power>0)
			{	result=result*no;
			   power--;
			}
			System.out.println(result);
		}
		else System.out.println("invalid power,it should be greater than 0");
			}
}
