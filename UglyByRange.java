import java.util.Scanner;
class UglyByRange
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start value");
		int start=sc.nextInt();
		System.out.print("Enter the end value");
		int end=sc.nextInt();
		while(start<=end)
		{	int i=start;
			while (i!=1)
			{
				if(i%2==0){i/=2;}
				else if(i%3==0){i/=3;}
				else if(i%5==0){i/=5;}
				else{break;}
			}
			if(i==1){System.out.println(start);}
			start++;
		}
		
	}
}
