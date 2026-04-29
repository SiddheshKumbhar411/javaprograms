class Practice02 
{
	int a;
	String st="hello";
	public static void main(String[] args) 
	{
		System.out.println("class 1");
	}
	
}
class D1
{
	public static void main(String[] args) 
	{
		Practice02 ref=new Practice02();
		System.out.println(ref.a);
		System.out.println(ref.st);
		System.out.println(ref.);
	}
}
