class PrimeInSquare
{
	public static void main(String[] args) 
	{	
		int n=5;
		int a=2;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n; )
			{
				if(isPrime(a,2))
				{	if(a<=9){
					System.out.print(a+"  ");
							}
					else
					{
						System.out.print(a+" ");
					}
					j++;
				}
				a++;
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int n,int deno)
	{	
		while(deno<=n/2)
			{
				if(n%deno==0)
				{
					return false;
				}
				deno++;
			}
			return true;
	}
	
}
