class Pattern25 
{
	public static void main(String[] args) 
	{	int n=7,st=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<st;j++)
			{
				System.out.print("*"+" ");	
			}
		System.out.println();
		if(i<n/2)
		{
		  st-=2;
		}
		else
		{
			st+=2;
		}
		}
		
	}
}
