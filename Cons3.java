class Cons3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//new Cons3();
		new Cons3(10);/* instead of creating multiple object i just used constructor chaining
		so that when i call one constructor, rest constructor should be executed*/
	}
	Cons3()
	{
		System.out.println("this is constructor");
	}
	Cons3(int a)
	{	this();
		System.out.println("this is constructor 2 "+a);
	}
}
