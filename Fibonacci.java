import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int f1=0,f2=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many numbers are needed");
		int num=scan.nextInt();
		System.out.println("Fibonacci series of "+ num +" term is:\n");
		for(int i=0;i<num;i++)
		{
			System.out.println(f1+" ");
			int s=f1+f2;
			f1=f2;
			f2=s;
		}
	}
}
			
			