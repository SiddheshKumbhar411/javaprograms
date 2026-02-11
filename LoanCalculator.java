import java.util.Scanner;
class LoanCalculator{
			public static void main(String[] args)
				{ Scanner sc=new Scanner(System.in);
					for(;;){
					System.out.println("**** welcome ****");
					System.out.print("enter the amount:");
					double amount=sc.nextDouble();
					if(amount<1000||amount>100000){
						System.out.println("\n invalid amount\n");
						continue;}	
					System.out.println("rate of interest (P.M):");
					double interest=sc.nextDouble();
					if(interest<=1||interest>=30){
						System.out.println("\n invalid interest:\n");
						continue;}
					System.out.println("loan tenure(months):");
					int tenure=sc.nextInt();
					if(tenure<3||tenure>36){
						System.out.println("\n invalid tenure\n");
						continue ;}
					double perMonthInt=(amount/100)*interest;
					double totalInterestAmount=perMonthInt*tenure;
					double emi=(amount+totalInterestAmount)/tenure;
					double totalAmount=amount+totalInterestAmount;
					System.out.println("\n Monthly Emi:"+emi);
					System.out.println("principal amount:"+amount);
					System.out.println("total interest:"+totalInterestAmount);
					System.out.println("total amount:"+totalAmount);
				}}
			}
		