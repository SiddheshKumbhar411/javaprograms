class  Frequency
{
	public static void main(String[] args) 
	{	int n=12554;
		for(int i=0;i<=9;i++)
		{
			int ct=0;
			int temp=n;
			while(temp!=0)
			{
				if(temp%10==i)
				{
					ct++;
				}
				temp/=10;
			}
			
			System.out.println(i+"->"+ct);
		}
		
	}
}
