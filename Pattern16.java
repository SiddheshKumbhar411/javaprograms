class Pattern16
{
	public static void main(String[] args) 
	{	int n=5,start=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{	if(start<=9){System.out.print(start+"  ");}
				else{System.out.print(start+" ");}
		
			}
			start++;
			System.out.println();
	
		}
		
}   }
