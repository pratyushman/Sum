class Sum
{
	public static void main(String[] args) 
	{
		int n=1234;
		int sum=1;
		while(n!=0)
		{
			sum=sum*(n%10);
			n/=10;
		}
		System.out.println(sum);
	}
}
