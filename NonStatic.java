class NonStatic
{	double pi;
	{
		 pi=22/7.0;
	}
	public static void main(String[] args) 
	{	
		NonStatic ref=new NonStatic();
		System.out.println(ref.pi);
	}
}
