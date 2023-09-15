class Rev 
{
	public static void main(String[] args) 
	{
		int n=1234;
		int m=0;
		int rev=0;
		while(n!=0)
		{
			m=n%10;
			rev=rev*10+m;
		}
		System.out.println(rev);
	}
}
