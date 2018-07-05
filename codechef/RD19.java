import java.util.*;
class RD19
{
	static int gcd(int a,int b)
	{
		if(a==0 || b==0)
		{
			return 0;
		}
		if(a==b)
		{
			return b;
		}
		if(a>b)
		{
			return gcd(a-b,b);
		}
		else
		{
			return gcd(a,b-a);
		}
	}
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
			int n=sc.nextInt();
			int []a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int result=a[0];
			for(int i=1;i<n;i++)
			{
				result=gcd(result,a[i]);
			}
			if(result==1)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("-1");
			}
		}
	}

}