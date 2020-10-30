import java.util.Scanner;
class FactorN
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no to find factor of the number:");
		int num=obj.nextInt();
		int f=1;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println(i+" ");		
		}
	}
}
