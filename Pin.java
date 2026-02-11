import java.util.Scanner;
class Pin 
{
	public static void main(String[] args) 
	{  Scanner s=new Scanner(System.in);
		final int pin=1234;
		int UserPin;
		int attmpt=0;
		do{
			System.out.println("enter the pin");
			UserPin=s.nextInt();
			if(pin==UserPin){
				System.out.println("login success");
				break;
			}
			else { attmpt++;
				System.out.println("invalid pin.attempts left"+(3-attmpt));}
		}
		while (attmpt<3);
		
	}
}
