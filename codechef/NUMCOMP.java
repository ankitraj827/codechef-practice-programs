import java.util.*;
class NUMCOMP
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		for(int i1=0;i1<n1;i1++)
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			long n=sc.nextLong();
			if(n%2==0)
			{
				if(a>b && a>0 && b>0)
				{
					System.out.println("1");
				}
				else if(a<0 && b>0 && Math.abs(a)>b)
				{
					System.out.println("1");
				}
				else if(a<0 && b<0 && Math.abs(a)>Math.abs(b))
				{
					System.out.println("1");
				}
				else if(a>0 && b<0 && a>Math.abs(b))
				{
					System.out.println("1");
				}
				else if(Math.abs(a)==b || Math.abs(b)==a || a==b)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println("2");
				}
			}
			else
			{
				if(a>b && a>0 && b>0)
				{
					System.out.println("1");
				}
				else if(a<0 && b<0 && Math.abs(a)<Math.abs(b))
				{
					System.out.println("1");
				}
				else if(a>=0 && b<0)
				{
					System.out.println("1");
				}
				else if(Math.abs(a)==b || Math.abs(b)==a || a==b)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println("2");
				}
			}
		}
	}
}