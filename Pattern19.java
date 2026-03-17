class Pattern19 
{
	public static void main(String[] args) 
	{	int n=4;
		/*for (int i=0;i<n ;i++ )
		{
			for (int sp=0;sp<i;sp++ )
			{
				System.out.print(" "+" ");
			}
			for (int st=0;st<n-i ;st++ )
			{
				System.out.print("*"+" ");
			}
			for (int st1=0;st1<n-i-1;st1++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		for (int i=0;i<n ;i++ )
		{
			for(int j=0;j<(2*n-i)-1;j++)
			{
				if(j<i)
				{
				   System.out.print(" "+" ");	
				}
				else
				{
					System.out.print("*"+" ");	
				}
			}
			System.out.println();
		}
		*/
		for (int i=0;i<n ;i++ )
		{
			for(int sp=0;sp<i;sp++)
			{
				System.out.print(" "+" ");
			}
			for (int st=0;st<2*(n-i)-1 ;st++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
