
class Average{
		public static void main(String[] args)
			{
				double distancekm=14;
				double distanceMile=14/1.6;
				double seconds=45*60+30;
				double hours=seconds/3600.0;
				double speed=distanceMile/hours;
				System.out.printf("speed in miles per hour:%.3f",speed);
			}
		}				