import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no:");
		int a=obj.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is even.\n");
		}
		else
		{
			System.out.println(a+" is odd.\n");
		}
		
	}
} 