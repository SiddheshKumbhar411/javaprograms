class BankOOPs 
{
	static String IFSC;
	static String countryCode;
	static{
		//	System.out.println("Hello welcome to Canterburry branch");
		 System.out.println("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗");
        System.out.println("██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝");
        System.out.println("██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗  ");
        System.out.println("██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝  ");
        System.out.println("╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗");
        System.out.println(" ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝");

        System.out.println();
        System.out.println(" ████████╗ ██████╗ ");
        System.out.println(" ╚══██╔══╝██╔═══██╗");
        System.out.println("    ██║   ██║   ██║");
        System.out.println("    ██║   ██║   ██║");
        System.out.println("    ██║   ╚██████╔╝");
        System.out.println("    ╚═╝    ╚═════╝ ");

        System.out.println();
        System.out.println(" ██████╗ █████╗ ███╗   ██╗████████╗███████╗██████╗ ██████╗ ██╗   ██╗██████╗ ██╗   ██╗");
        System.out.println("██╔════╝██╔══██╗████╗  ██║╚══██╔══╝██╔════╝██╔══██╗██╔══██╗██║   ██║██╔══██╗╚██╗ ██╔╝");
        System.out.println("██║     ███████║██╔██╗ ██║   ██║   █████╗  ██████╔╝██████╔╝██║   ██║██████╔╝ ╚████╔╝ ");
        System.out.println("██║     ██╔══██║██║╚██╗██║   ██║   ██╔══╝  ██╔══██╗██╔══██╗██║   ██║██╔══██╗  ╚██╔╝  ");
        System.out.println("╚██████╗██║  ██║██║ ╚████║   ██║   ███████╗██║  ██║██████╔╝╚██████╔╝██║  ██║   ██║   ");
        System.out.println(" ╚═════╝╚═╝  ╚═╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ");


		IFSC="A101";
		countryCode="IND";
	}
	int accno;
	double balance;
	String status;
	{
		status="active";
		System.out.println("Thank you for creating account in our bank.We would love to help you");
		System.out.println("your account no is "+countryCode+this);
		System.out.println("you balance is"+balance);
		System.out.println("your acc status is "+status);
		
	}
	String customerName;
	BankOOPs(String customerName,double balance)
	{
		this.customerName=customerName;
		this.balance=balance;
	}
	void AccDetail()
	{
		System.out.println("\n[ Account Details ]");
        System.out.println("Bank     : " +IFSC);
        System.out.println("Customer : " + customerName);
        System.out.println("Acc No   : " + countryCode+this);
        System.out.println("countrycode: " + countryCode);
        System.out.println("Balance  : " + balance);
        System.out.println("Status   : " + status);
	}
	
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		BankOOPs a1=new BankOOPs("john",20_00_000);
		a1.AccDetail();
		BankOOPs a2=new BankOOPs("mia",50_00_000);
		a2.AccDetail();
	
	}
}
