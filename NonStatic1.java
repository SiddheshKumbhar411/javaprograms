class NonStatic1 
{
	int a;
	/*static
	{
		System.out.println("this is  static block");
	}*/
	/*{
		System.out.println("this is non static block");
		a=10;
	}*/
	NonStatic1()
	{
		a=10;
		System.out.println("this is constructor");
	}
	NonStatic1(int a)
	{
		System.out.println("this is constructor2"+a+" "+this.a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new NonStatic1(20);
		
	}
	
}
