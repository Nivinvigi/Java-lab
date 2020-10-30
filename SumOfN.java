import java.util.Scanner;
class SumOfN
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no of natural numbers needed:");
		n=obj.nextInt();
		for(int i=0;i<=n;i++)
		{		
			sum+=i;
		}
		System.out.println("The sum is:"+sum);
	}
}