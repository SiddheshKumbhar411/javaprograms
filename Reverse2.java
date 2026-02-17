import java.util.Scanner;
class Reverse2
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter a no: ");
		int no=sc.nextInt();
		String str=no+"";
		String rev="";
		for(int i=0;i<str.length();i++){
			rev=str.charAt(i)+rev;
		}
		
		
		System.out.println(rev);
	}
}
