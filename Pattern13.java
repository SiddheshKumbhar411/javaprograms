class Pattern13 
{
	public static void main(String[] args) 
	{	int start=1,n=4,ct=1;
		char alpha='a';
		for(int i=0;i<n;i+=2)
		{	
			for(int j=0;j<n;j++)
			{
			System.out.print((char)alpha+" ");
			alpha++;
			}
			//i++;
			
			System.out.println();
			
			for(int z=0;z<n;z++)
			{
				System.out.print(start+" ");
				start++;
				
			}
			System.out.println();
			
		}
		
		
	}
}
