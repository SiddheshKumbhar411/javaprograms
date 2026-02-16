import java.util.Scanner;
class StonePaperScissor
	{
		public static void main(String[] args)

		{  Scanner sc=new Scanner(System.in);
		   infiniteLoop:
		   for(;;)
		   {
			System.out.println("\n **** welcome****\n");
			// user implementation
			System.out.println("1.Stone\n2.PAPER\n3.SCISSOR\n");
			System.out.println("enter your response:");
			int dgtUser=sc.nextInt();
			String user="";
			
			if(dgtUser==1) user="STONE";
				else if(dgtUser==2) user="PAPER";
				else if(dgtUser==3) user ="SCISSOR";
				else{
					System.out.println("\nINVALID RESPONSE\n");
					continue infiniteLoop;
				    }
				//bot implementation
			   int dgtBot=0;
			   for(;;){
					dgtBot=(int)(Math.random()*10);
					if(dgtBot>=1&&dgtBot<=3)
						break;
					}
				String bot="";
			if(dgtBot==1) bot="STONE";
			else if(dgtBot==2) bot="PAPER";
			else bot="SCISSOR";
		System.out.printf("%n%10s %8s","BOT","USER");
		System.out.printf("%n%10s %8s",bot,user);
	//calculate winner
  if(bot.equals("STONE")&&user.equals("PAPER")||(bot.equals("PAPER")&&user.equals("SCISSORS"))||
     (bot.equals("SCISSOR")&&user.equals("STONE")))
	{
		System.out.println("\n ***user won***\n");
	}
	else if(bot.equals("STONE")&&user.equals("SCISSOR")||(bot.equals("PAPER")&&user.equals("STONE"))||
		(bot.equals("SCISSOR")&&user.equals("PAPER")))
		{
			System.out.println("\n ***bot won*** \n");
		}
	else{
		System.out.println("\n It's A draw\n");
		}
	}
}

}

		