import java.util.Scanner;
class Calculator2{     
		    public static void main(String[] args)
			{  double v1,v2;
			
			 char c;	
				Scanner sc=new Scanner(System.in);
				// user input block
				System.out.println("enter operand 1:");
				v1=sc.nextDouble();
				System.out.println("enter the operator:");
				c=sc.next().charAt(0);
				System.out.println("enter operand 2:");
				v2=sc.nextDouble();
				// operation block
				if(c=='+')
					{System.out.printf("answer is %.3f",v1+v2);}
				else if(c=='-')
					{System.out.printf("answer is %.3f",v1-v2);}
				else if(c=='*')
					{System.out.printf("answer is %.3f",v1*v2);}
				else if(c=='/')
					{System.out.printf("answer is %.3f",v1/v2);}
				else if(c=='%')
					{System.out.printf("answer is %.3f",v1%v2);}
				else{ System.out.println("invalid operator");}


			
			   



}	

}