class CountFactor1
{
	public static void main(String[] args) 
	{	
		System.out.println(isFactor(10,1,0));
	}
	public static boolean isFactor(int n,int div,int ct)
	{
		return(div<=n?(n%div==0?isFactor(n,div+1,ct+1):isFactor(n,div+1,ct)):(ct==3?true:false));
	}
}
