import java.util.*;
class ZOZ
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int N1=sc.nextInt();
			int K=sc.nextInt();
			int []a=new int[N1];
			int sum=0;
			for(int j=0;j<N1;j++)
			{
				a[j]=sc.nextInt();
				sum=sum+a[j];
			}
			int count=0;
			for(int j=0;j<N1;j++)
			{
				int m1=a[j];
				m1=m1+K;
				int sum2=sum;
				sum2=sum2-a[j];
				if(m1>sum2)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}


}