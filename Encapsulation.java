class Encapsulation 
{
	
	public static void main(String[] args) 
	{	
		demo ref=new demo();
		ref.setValue(5);
		System.out.println(ref.getValue());
	}
	
}
class demo
{
	private int a;
	void setValue(int a)
	{
		this.a=a;
	}
	int getValue()
	{
		return a;
	}
}
