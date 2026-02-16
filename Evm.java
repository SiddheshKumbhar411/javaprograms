import java.util.Scanner;
class Evm{

	    static int bjp,aap,cong,ncp,nota;
		public static void main(  String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the population:");
			int population=sc.nextInt();
		for(int i=1;i<=population;i++)
			{     System.out.println("\n ****welcome****");
				System.out.println("Apka ek vote desh badal sakta hai");
				System.out.println("1.BJP \n2.AAP\n3.CONG\n4.NCP\nNOTA");
				System.out.println("\nEnter your response:");
				String resp=sc.next().toUpperCase();
			 if(resp.equals("BJP"))
				{   bjp++;
					System.out.println("you have voted for bjp");
					System.out.println("acche din ayenge");
				}
				else if(resp.equals("AAP"))
					{  aap++;
						System.out.println("you have voted for aap");
					          System.out.println("your vote is important");
					}
				else if(resp.equals("CONG"))
					{
						System.out.println("you have voted for cong");
					          System.out.println("your vote is important");
					}
				else if(resp.equals("NCP"))
					{
							System.out.println("you have voted for NCP");
					          System.out.println("your vote is important");
					}
				else if(resp.equals("NOTA"))
					{
							System.out.println("you have voted for NOTA");
					          System.out.println("your vote is important");
					}
				else{
					System.out.println("invalid response");
					i--;
				    }
				}
					System.out.println("bjp "+bjp);
					System.out.println("cong "+cong);
					System.out.println("ncp "+ncp);
					System.out.println("aap "+aap);
					System.out.println("nota "+nota);
					
					if(bjp>=cong&&bjp>=ncp&&bjp>=aap&&bjp>=nota){
						System.out.println("bjp has won the election "+bjp+" by votes");
						}
					else if(cong>=bjp&&cong>=ncp&&cong>aap&&bjp>nota)
						{
						System.out.println("cong has won the election "+cong+" by votes");
						}
					else if(aap>=bjp&&aap>=cong&&aap>=ncp&&aap>=nota)
						{
							System.out.println("aap has won the election "+aap+" by votes");	
						}
					else if(ncp>=bjp&&ncp>=cong&&ncp>=aap&&ncp>=nota)	
						{
							System.out.println("ncp has won the election "+ncp+" by votes");	
						}
					else
						{
							System.out.println("no one has won "+nota);	
						}


	
				}
		}


