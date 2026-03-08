class Pattern10  
{
	public static void main(String[] args) 
	{	/*int start=1,n=9;
	
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(start);
			}
			start++;
			System.out.println();
		}
		 O/P 1 1 1 1
			 2 2 2 2
			 3 3 3 3
			 4 4 4 4 
			 
		*/
		
		/*int n=4;
	for(int i=0;i<n;i++)
		{ int start=1;
			for(int j=0;j<n;j++)
			{  
				System.out.print(start+" ");
				start++;
			}
			
			System.out.println();
		}
		o/p 1 2 3 4
			1 2 3 4
			1 2 3 4
			1 2 3 4
		*/
		 int start=1,n=4;
	for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{  
				 if(start<=9){ System.out.print(start+"    ");}
				 else{ System.out.print(start+"   ");}
				start++;
			}
			
			System.out.println();
		}
		
	}
}
