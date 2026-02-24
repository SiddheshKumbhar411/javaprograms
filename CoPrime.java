import java.util.Scanner; 
class CoPrime
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first no: ");
		int n1=sc.nextInt();
		System.out.print("Enter the second no: ");
		int n2=sc.nextInt();
		int small=n1<n2?n1:n2;
		while(true){
			if(n1%small==0&&n2%small==0){break;}
			small--;
		}
		if(small==1){System.out.println("it is co prime no");}
		else{System.out.println("it is not a co prime no");}
	}
}
