class Strong
{
	public static void main(String[] args)
	{
			System.out.println(count(1234));
		
	}
	public static int count(int n) 
	{
		if(n==0)
		{
			return 0;
		}
		int a=n%10+count(n/10);
		if(a<=9)
		{
			return a;
			// return a % 10 + sum (a/10);
			return sum(a);
		}
	}
	
}

