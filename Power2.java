import java.util.Scanner;
class Power2 
{
	public static void main(String[] args) 
	{	Scanner sc= new Scanner(System.in);
		System.out.print("enter the no: ");
		double no=sc.nextDouble();
		System.out.print("enter the power: ");
		double power=sc.nextDouble();
		sc.close();
		
		if(power<0){
			 power*=-1;
			 no=1/no;}
			 double op=1;
			 for(int i=1;i<=power;i++)
				 op*=no;
			System.out.println(op);
			 System.out.println(Math.pow(no,power));
			}
}
