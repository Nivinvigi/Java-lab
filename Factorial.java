import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no to find factorial:\n");
		int num=obj.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
		}
		System.out.println("Factorial of is "+factorial);
	}
}


		