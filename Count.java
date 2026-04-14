class Count 
{
	public static void main(String[] args) 
	{
		//System.out.println(count(1234,0));
		System.out.println(isZero(123055,0));
		
	}
	public static int count(int n,int ct)
	{
		//return n==0?ct+1:(n!=0?count(n/=10,ct+1):ct);	
		//if(n==0 &&ct==0) return 1;
		//return n!=0?count(n/=10,ct+1):ct;
		return (n==0&&ct==0)?1:(n!=0?count(n/=10,ct+1):ct);
	}
	public static boolean isZero(int n,int ct)
	{
		//return (n%10==0&&n!=0)?true:(n==0?false:isZero(n/=10));
		//return n!=0?(n%10==0?true:isZero(n/=10);		
		return (n==0&&ct==0)?true:((n%10==0&&n!=0)?true:(n==0?false:isZero(n/10,ct+1)));
	}
}
