class Test2 
{
	static
	{
		System.out.println("bl1");
		Test1.main(null);
	}
	public static void main(String[] args) 
	{	
		System.out.println("after static");
		System.out.println(Test1.a);
	}
	static
	{	
		System.out.println("bl2");
		Test1.main(null);
	}
}
