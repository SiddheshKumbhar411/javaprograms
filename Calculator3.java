import java.util.Scanner;
class Calculator3
{
 

	public static void main(String[] args) 
	{   Scanner sc=new Scanner(System.in);
		
		System.out.print("enter operand 1:");
		double op1=sc.nextDouble();
		System.out.print("enter operator:");
		char ch=sc.next().charAt(0);
		System.out.print("enter operand 2:");
		double op2=sc.nextDouble();
		
		switch(ch){
					case '+':System.out.print(op1+"+"+op2+"="+(op1+op2)); break;
					case '-':System.out.print(op1+"-"+op2+"="+(op1-op2));	break;
					case '*':System.out.print(op1+"*"+op2+"="+(op1*op2));	break;
					case '/':System.out.print(op1+"/"+op2+"="+(op1/op2));	break;
					case '%':System.out.print(op1+"%"+op2+"="+(op1%op2)); break;
					default:{System.out.println("/ninvalid operator entered/n");break;}
					
	
	}
	}
}
