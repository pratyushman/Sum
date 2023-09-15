class Fac 
{
	public static int fac(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n%10*n%10+n/10;
	}
		public static void main(String[] args) 
	{
		System.out.println(fac(54321));
	}
}
