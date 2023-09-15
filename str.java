class Str 
{
	public static void main(String[] args)
	{
		m1(1);
	}
	private static void m1(int i)
	{
		if(i==4)
		{
			return;
		}
				m1(i+1);
				m1(i+1);
		System.out.println(i);
	}
}