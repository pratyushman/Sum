class Method 
{
	public void m1(int X,double D)
	{
		System.out.println("hiii");
	}
	public void m1(double D,int X)
	{
		System.out.println("hiii");
 	}
	public static void main(String[] args)
	{
		Test t=new Tset();
		t.m1(10,10.5);
		t.m1(10.5,10);
		t.m1(10,10);
		
	}
}