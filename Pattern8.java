class Pattern8
{
	public static void main(String[] args) 
	{	int n=5;
		for(int i=0;i<n;i++)
		{
			for (int sp=0;sp<n-i-1 ;sp++ )
			{	System.out.print(" "+" ");
			} 
			
			for (int st=0;st<n;st++)
			{
				System.out.print("*"+" ");
			}
			
		
			System.out.println();
			
		}
	}	
}
