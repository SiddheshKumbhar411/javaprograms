class Cons1 
{	int a=0;
	public static void main(String[] args) 
	{	
		
		System.out.println("the value of local variable declared in method cons1()");
		Cons1 ref=new Cons1();
		ref.cons1(10);
		
	}
	public void cons1(int a)
	{	
		Cons1 ref=new Cons1();
		this.a=33;
		
		System.out.println("local variable a: "+this.a);
		System.out.println("local variable a: "+ref.a);
		System.out.println("global variable a: "+a);
	}
}
 
