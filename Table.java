import java.util.Scanner    ;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a no:");
		int a=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(a+"x"+i+"="+(a*i));
			i++;
		}
	}
}
