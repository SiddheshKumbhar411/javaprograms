class Pattern18 
{
	public static void main(String[] args) 
	{	
		int n=4,oddDiff=1,evenDiff=7;
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=n;j++)
			{ 
			  System.out.print(temp);
				if(j%2!=0)
				{
					
					temp+=evenDiff;
				}
				else
				{
					
					temp+=oddDiff;
				}
				
			}
			   oddDiff+=2;
				evenDiff-=2;
			
			System.out.println();
		}
		
	}
}
