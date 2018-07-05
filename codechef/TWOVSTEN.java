import java.util.*;
class TWOVSTEN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			if(n1%10==0)
			{
				System.out.println("0");
			}
			else if(n1%5==0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("-1");
			}
		}
	}
}