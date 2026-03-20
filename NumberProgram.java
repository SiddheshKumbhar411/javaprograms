class NumberProgram 
{
	public static void main(String[] args) 
	{
		primeno(24);
		palindrome(321);
	}
	public static void primeno(int n) //prime no program
	{
		if(n<=1)
		{
			System.out.println(n+" is not prime");	
		}
		else
		{
			int deno=2;
			while(deno<=n/2)
			{
				if(n%deno==0){break;}
				deno++;
			}
			if(deno>n/2)
			{
				System.out.println(n+" is  prime");	
			}
			else
			{
				System.out.println(n+" is not prime");	
			}
		}
	}
	public static void palindrome(int n)//palimdrome 
	{
		int temp=n,rev=0;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			temp/=10;
		}
		if(rev==n){System.out.println(n+" is palindrome");	}
		else{System.out.println(n+" is not palindrome");	}
			
	}
	
}
