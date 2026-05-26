class NonStatic1 
{
	static
	{
		System.out.println("this is  static block");
	}
	{
		System.out.println("this is non static block");
	}
	NonStatic1()
	{
		System.out.println("this is constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new NonStatic1();
		
	}
	
}
