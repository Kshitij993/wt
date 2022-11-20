import java.util.Scanner;
class palendrom
	{
	public static void main(String args[])
		{
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter a no : ");
		n=s.nextInt();
		int n1=n,p,r=0;
		
		while(n1!=0)
			{
			p=n1%10;
			r=r*10+p;
			n1=n1/10;
			}
		if(r==n)
			System.out.println("Palendrum no ");
		else
			System.out.println("Not Palendrum ");
		}
	}
