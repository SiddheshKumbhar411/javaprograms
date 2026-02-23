import java.util.Scanner;
class Neon
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no: ");
		int no =sc.nextInt();
		int add=0,temp=no;
		temp=temp*temp;
		//System.out.println(no);
		//int add=0;
		while(temp>0){
			add=add+temp%10;
			//System.out.println(add);
			temp/=10;
			//System.out.println(no);
		}
		if(add==no){System.out.println("it is neon no");}
		else{System.out.println("it is not a neon no");}
	}
}

	  