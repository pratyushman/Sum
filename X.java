class x {

	public static void main(String[] args) {
		int n=52232;
		int c=n;
		int inner=0;
		int outer=0;
		while(c>0)
		{
			if(c==n || c<9)
			{
				outer+=c%10;
			}
			else
			{
			inner+=c%10;
			}
			n=n/10;
		}
		if(inner==outer)
		{
			System.out.println("Xylme number");
		}
		else
		{
		System.out.println("not Xylme number");				
		}
	}

}
