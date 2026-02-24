import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the first no: ");
		int n1=sc.nextInt();
		System.out.print("enter the second no: ");
		int n2=sc.nextInt();
		
		int large=n1>n2?n1:n2;
		/*while(true){
					 if(large%n1==0&&large%n2==0){
						System.out.println("the lcm is "+large);break;
					 }
					 large++;}*/
					 int i=1;
		while(true){
			
			if((i*large)%n1==0&&(i*large)%n2==0){
				System.out.println("the lcm  is "+(i*large));
				break;
			}
			i++;
		}			 
		
	}
}
