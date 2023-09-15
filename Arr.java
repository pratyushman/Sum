class A 
{
	public static void main(String[] args) 
	{
		int n={10,20,20,30,50,40,10};
		for(int i=0;i<arr.length-1;i++)
		{
			int count=0;
			if(arr[i]==0)
			{
				continue;
			}
			for(int j=i+1;j<arr.legth;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
