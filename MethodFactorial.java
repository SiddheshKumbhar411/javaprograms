class MethodFactorial
{
	public static void main(String[] args) 
	{
		factorial(5);
	}
	public static void factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact*=n;
			n--;
		}
		System.out.println(fact);
	}
}
