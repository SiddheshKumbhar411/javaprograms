class MethodXylem 
{
	public static void main(String[] args) 
	{
		System.out.println(isXylem(10100));
	}
	public static int lastDigit(int n)
	{
		return n%10;
	}
	public static int firstDigit(int n)
	{
		while(n>9)
		{
			n/=10;
		}
		return n;
	}
	public static int midDigit(int n)
	{
		n/=10;
		int sum=0;
		while(n>9)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
		
	}
	public static boolean count(int n)
	{	int ct=0;
		for(int i=n;i!=0;i/=10)
		{
			ct++;
		}
		if(ct%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isXylem(int n)
	{	
		if(count(n))
		{
			if(midDigit(n)==(lastDigit(n)+firstDigit(n)))
			{
			return true;
			}
			else {
				return false;
				}
		}
		else
		{
			return false;
		}
	}
	
}
