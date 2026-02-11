import java.util.Scanner;
import java.util.ArrayList;
class Bank{
	     static String name;
	     static String address;
	     static long contact;
	    static long adhaar;
	     static String pancard;
	    static double balance;
		static int pin;
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				welcomeLoop:
			for(;;){
				 System.out.println(" \n welcome \n");
				System.out.println("***Lakshmi chit fund***\n");
				System.out.print("1.create account\n2.login\n");
				System.out.print("enter your response:");
				int resp=sc.nextInt();
				switch(resp)
				{
					case 1:{if(name!=null)
							System.out.println("\n account already exists\n");
							continue;}
					System.out.println("\n account creation page\n");
					System.out.print("name: ");
					name=new Scanner(System.in).sc.nextLine();
					System.out.print("address");
					address=new Scanner(System.in).sc.nextLine();
					System.out.print("contact:");
					contact=new Scanner(System.in).nextLong();
					System.out.print("adhaar:");
					adhaar=new Scanner(System.in).nextLong();
					System.out.print("pancard:");
					pancard=new Scanner(System.in).nextLine();
					System.out.println("enter a amount");
					balance=new Scanner(System.in).nextInt();
					transaction.add("DEPOSIT(creation):"+balance);
					System.out.println("enter pin");
					pin =new Scanner(System.in).nextInt();
					System.out.println("account created successfuly");
					break;
					}
				   case 2:{
						if (name==null)
						System.out.println("create your account first");
						continue;}
					System.out.println("\n login module\n");
					System.out.println("contact:");
					long userContact=new Scanner(System.in).nextLong();
					System.out.println("enter pin");
					int userPin=new Scanner(System.in).nextInt();
					
					if(contact==userContact&&pin==userPin){
						System.out.println("login successful");
						features:
						 for(;;){
							System.out.println("\n **** features ****\n");
							System.out.println("1.deposit\n2.withdraw\n3.check balance\n4.logout\n5.Transaction");
							System.out.print("\n enter your option:");
							int opt=sc.nextInt();
							switch(opt)
							{
								case 1:{
									System.out.println("\n deposit amount module:");
									System.out.print("enter deposit amount");
									double deptAmt=new Scanner(System.in).nextDouble();
									balance+=deptAmt;
									transaction.add("DEPOSIT:"+deptAmt);
									System.out.println("\n amount deposited sucessfully\n");
									break;}
								case 2:{
									System.out.println("withdrawl amount module");
									System.out.println("enter the amount:");
									double wdrwAmt=new Scanner(System.in).nextInt();
									if(pin2==pin){
										if(wdrwAmt<=balance){
										balance-=wdrwAmt;
										transaction.add("WITHDRAW:"+wdrwAmt);
										System.out.println("\n amount debited successfully");}
										else{
											System.out.println("\n insufficient funds\n");}
											}
								}else{ System.out.println("\n invalid pin\n");
								} break;}
									case3:{ System.out.println("\n check balance module:\n");
											 System.out.print("enter your pin:");
												int pin2=new Scanner(System.in).nextInt();
												if(pin2==pin){
															 System.out.println("your account balance is:"+balance+"rs");
												}
												else{
														 System.out.println("\n invalid pin/n");}
														break;}
														
														
												case 4:{
														 System.out.println("\n thank you &visit again\n");
														 continue welcomeLoop;
												}
												case 5:{
															System.out.println("\n ***Transaction***\n");
															for(String ele:transaction){
																		System.out.println(ele);}
																		System.out.println();
																		break;}
												default:{
															 System.out.println("\n invalid response\n");
												}
														
												}}}}
												else{
														 System.out.println("invalid cred");
														 
												}
													break;}
													default:{ System.out.println("invalid response");
										}}}}}
			

	
