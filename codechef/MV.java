import java.util.*;
class MV
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum1=0;
		outer:
		for(int i=0;i<n;i++)
		{
			int n2=sc.nextInt();
			sum1=sum1+n2;
			if(sum1>10000)
			{
				break outer;
			}
			if(n2<=0||n2>500)
			{
				continue outer;
			}
			int []a=new int[n2];
			for(int j=0;j<n2;j++)
			{
				a[j]=sc.nextInt();
			}
			int []a1=new int[n2];
			Arrays.fill(a1,0);
			for(int j=0;j<n2;j++)
			{
				int m=a[j];
				for(int k=0;k<n2;k++)
				{
					if(j!=k)
					{
						int sum=0;
						if(j<k)
						{
							for(int k1=j+1;k1<k;k1++)
							{
								sum=sum+a[k1];
							}
						}
						else if(j>k)
						{
							for(int k1=k+1;k1<j;k1++)
							{
								sum=sum+a[k1];
							}
						}
						if(a[k]>=sum)
						{
							a1[j]=a1[j]+1;
						}
					}
				}
			}
			for(int j=0;j<n2;j++)
			{
				System.out.print(a1[j]+" ");
			}
			System.out.println();
		}
	}


}