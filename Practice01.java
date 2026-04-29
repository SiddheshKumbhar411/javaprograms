class Practice01 
{
	int a;
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Practice01 ref=new Practice01();
		System.out.println(ref.a);
		ref.sum();
	}
	public void sum()
	{
		System.out.println(a);
	}
	
}
