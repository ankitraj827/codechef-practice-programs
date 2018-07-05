import java.util.*;
class AFK
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int m1=2*b;
			int m2=a+c;
			if(m1==m2)
			{
				System.out.println("0");
			}
			else
			{
				int count=0;
				if(m2%2!=0 && m1>m2)
				{
					m2++;
					count++;
				}
				else
				{
					m2--;
					count++;
				}
				if(m1==m2)
				{
					System.out.println("1");
				}
				else if(m1<m2)
				{
					count=count+(m2-m1)/2;
				}
				else
				{
					count=count+(m1-m2)/2;
				}
				System.out.println(count);
			}
		}
	}
}