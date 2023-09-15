import java.util.Scanner;
class StringLength 
{
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int length=s.length();
		System.out.println(length);
	}

}
