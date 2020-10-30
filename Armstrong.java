import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no for checking armstrong:");
		int n=obj.nextInt();
		int rem,sum=0;
		int check=n;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem*rem*rem;
			n/=10;
		}
		if(check==sum)
			System.out.println("The no is Armstrong.\n");
		else
			System.out.println("The no is not Armstrong.\n");
	}
}

		