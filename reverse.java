class Reverse 
{
	public static void main(String[] args) 
	{
		int n=25369;
		int rev=0;
		int j=0;
		while(n!=0)
		{
			j=n%10;
			rev=rev*10+j;
		}
		System.out.println(n);
	}
}
