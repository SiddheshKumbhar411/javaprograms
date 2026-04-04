class ArmstrongRecursion 
{
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(135));
		
	}
	public static int count(int n,int ct)
	{
		return n==0?ct:count(n/10,ct+1);
	}
	public static int power(int base,int raise)
	{
		return raise==0?1:base*power(base,raise-1);
	}
	/*public static int sumOfDigit(int n,int temp,int sum)
	{
		return n==0?sum:sumOfDigit(n/10,temp,sum+power(n%10,count(temp,0)));
	}*/
	public static int sumOfDigit(int n,int sum)
	{
		return n==0?sum:sumOfDigit(n/10,sum+power(n%10,count(n,0)));
	}
	public static boolean isArmstrong(int n)
	{
		return n==sumOfDigit(n,0);	
	}
}
