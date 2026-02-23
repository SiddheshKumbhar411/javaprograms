import java.util.Scanner;
class PronicNo 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: ");
		int no=sc.nextInt();
		int x=0;
		/*while(x<no){
			x=n*(n+1);
			n++;
		}
		if(x==no){System.out.println("it is pronic no");}
		else{System.out.println("it is not a pronic no");}*/
		for(int n=0;x<no;n++){
			x=n*(n+1);
		}
		if(x==no){System.out.println("it is pronic no");}
		else{System.out.println("it is not a pronic no");}
		
			
		

	}
}
