class Pattern12 
{
	public static void main(String[] args) 
	{	int start=1,n=4,temp=0;
		for(int i=0;i<n;i++)
		{	temp=start;
			for(int j=0;j<n;j++)
			{	 
			if(temp<=9){ System.out.print(temp+"   ");}
			else{System.out.print(temp+"  ");}
				 temp+=4;
			}
			System.out.println();
			start++;	
		}
		
	}
}
