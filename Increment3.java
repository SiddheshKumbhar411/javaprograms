class Increment3
		{
			public static void main(String[] args)
				{
					int p=-3;
					int q=8;
					int r=13;
					int s;
					System.out.println(s=p++ -q-- *r);
					System.out.println(q=--p + s++ - --q);
					System.out.println(p=p++ * p-- +r);
					System.out.println(r=r--);
					
				}	
		}