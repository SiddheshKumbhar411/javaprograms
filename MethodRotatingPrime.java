class MethodRotatingPrime 
{
	public static void main(String[] args) 
	{
		System.out.println(isRotatingPrime(113));
	}
	
	public static boolean prime(int n)//131
	{
		int deno=2;
		if(n<=1){return false;}
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
	public static int count(int num)
	{ int ct=0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	
	public static int power(int base,int raise)
	{
		int pow=1;
		while(raise>0)
		{
			pow*=base;
			raise--;
		}
		return pow;
	}
	public static int rotate(int num)
	{
		/*int last=num%10;
		num/=10;
		int ct=count(num);
		int pow=power(10,ct);
		int ans=last*pow+num;
		return ans;*/
		return num%10*power(10,count(num)-1)+num/10;	
	}
	public static boolean isPrime(int num)
	{
		int deno=2;
		while(deno<=num/2)
		{
			if(num%deno==0){return false;}
			deno++;
		}
		return true;
	}
	public static  boolean isRotatingPrime(int num)
	{
		if(isPrime(num))
		{
			int rot=rotate(num);
			while(rot!=num)
			{
				if(isPrime(rot))
				{
					rot=rotate(rot);
				}
				else{
					break;
				}
				
			}
			return rot==num;
		}
		return false;
	}
}
	
