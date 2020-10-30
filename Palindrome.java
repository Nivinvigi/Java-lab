import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no for checking palindrome or not:");
		int  num=obj.nextInt();
		int ans=0,rem,check;
		check=num;
		while(num!=0)
		{
			rem=num%10;
			ans=ans*10+rem;
			num/=10;
		}
		if(check==ans)
			System.out.println("The no is armstrong.");
		else
			System.out.println("The no is not Armstrong.");
	}
}