class Person
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}





class Encapsulation 
{
	public static void main(String[] args) 
	{
		Person a=new Person();
		a.setName("sid");
		a.setAge(10);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
	}
}
