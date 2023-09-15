import java.util.Scanner;
class A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
        String s=sc.nextLine();
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			if(s.equals(rev))
			{
						System.out.println("PS");
			}
			else
						System.out.println("NPS");
    }

}
