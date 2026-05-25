class Cons4 
{
	int a;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Cons4(10);
	}
	Cons4(int a)
	{	this();
		System.out.println("before intialization"+this.a);
		this.a=a;
		System.out.println(this.a);
		System.out.println("local"+a);
		
	}
	Cons4()
	{
		System.out.println(this.a);
	}
}
