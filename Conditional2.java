class Conditional2
		{public static void main(String[] args)
			{ int a=10;
			  int b=20;
		          int c=30;
			  int d=40;
			//System.out.println(a>b?(a>c?(a>d?a:d)):b>		
			System.out.println((a>b?a:b)>(c>d?c:d)?(a>b?a:b):(c>d?c:d));}}