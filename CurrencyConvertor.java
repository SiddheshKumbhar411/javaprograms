import java.util.Scanner;
class CurrencyConvertor{
				public static void main(String[] args)
			{Scanner sc=new Scanner(System.in);
			 //infiniteLoop
		   	for(;;){
				System.out.println("\n Welcome");
				System.out.println("*****currency convertor****\n");
				System.out.print("enter the amount (INR): ");
				double amount=sc.nextDouble();
				System.out.println("1.USD\n2.EUR\n3.KWD\n4.GBP\n5.AUS\n6.PESO\n7.NZD\n8.TWD\n9.CND\n10.YIN");
				System.out.print("enter your response:");
				String resp=sc.next().toUpperCase();
				
				
				double convertedAmount=0;
				if(resp.equals("USD"))
					{convertedAmount=amount/90.21;}
				 else if(resp.equals("EUR"))
					{convertedAmount=amount/106.53;}
				else if(resp.equals("KWD"))
					{convertedAmount=amount/293.61;}
				else if(resp.equals("GBP"))
					{convertedAmount=amount/123.31;}
				else if(resp.equals("AUS"))
					{convertedAmount=amount/63.33;}
				else if(resp.equals("PESO"))
					{convertedAmount=amount/0.06;}
				else if(resp.equals("NZD"))
					{convertedAmount=amount/54.44;}
				else if(resp.equals("TWD"))
					{convertedAmount=amount/2.85;}
				else if(resp.equals("CND"))
					{convertedAmount=amount/65.90;}
				else if(resp.equals("YIN"))
					{convertedAmount=amount/0.57;}
			        else{
					
					System.out.println("invalid currency");
					}
				if(assump){
						System.out.printf("%n%20.2f INR=%.2f %s%n",amount,convertedAmount,resp);}

					}
				}}