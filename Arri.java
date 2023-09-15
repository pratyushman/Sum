class A
{
	int x=10;
	public static void main(String[]args)
	{
		B b=new B();
		b.m1();
	}
}
class B extends A
{
	int x=20;
	public void m1()
	{
		System.out.println("this.x");
		System.out.println("super.x");
		
	}	
}
		