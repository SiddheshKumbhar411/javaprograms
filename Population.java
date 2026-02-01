class Population{
	public static void main(String[] args)
		{
			long currPop=312032486;
			long seconds=(365*24*60*60)*5;
			final long BIRTH=seconds/7;
			final long DEATHS=seconds/13;
			final long IMMIGRANTS=seconds/45;
		long newPop=currPop+BIRTH-DEATHS+IMMIGRANTS;
		System.out.println("previous pop: "+currPop);
		System.out.println("New pop:"+newPop);}}