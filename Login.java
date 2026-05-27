import java.util.Scanner;
class Login 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("welcome");
		Info ref=new Info();
		System.out.print("please create your login id : ");
		ref.setLoginID(sc.next());
		System.out.println();
		System.out.print("please set your password : ");
		ref.setPassword(sc.next());
		System.out.println(ref.getLoginID());
		System.out.println(ref.getPassword());
		
			
	}
	
}
class Info
{
	private String loginid;
	private String password;
	void setLoginID(String loginid)
	{
		this.loginid=loginid;
	}
	void setPassword(String password)
	{
		this.password=password;
	}
	String getLoginID()
	{
		return loginid;
	}
	String getPassword()
	{
		return password;
	}
}
