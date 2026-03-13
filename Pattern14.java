class Pattern14
{
	public static void main(String[] args) 
	{	int n=4,start=1;
		char alpha='A';
		for(int i=0;i<n;i++)
		{	for(int j=0;j<n;j++)
			{	if(start<=9){System.out.print(alpha+""+start+"   ");}
				else{System.out.print(alpha+""+start+"  ");}
				alpha++;
				start++;
			}
			
			System.out.println();
		}
		
	}
}
