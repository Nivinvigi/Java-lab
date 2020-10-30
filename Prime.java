import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no:");
		int a=obj.nextInt();
		int temp=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("The no is composite.\n");
				break;
			}
			else
				temp=1;
		}
		if(temp==1||a==2)
		{
			System.out.println("The no is prime.");
		}
		else if(a==1)
			System.out.println("The no is neither prime or composite.");
		else
			System.out.println("Invalid input");
		
	}
}