import java.util.*;
class HORSES
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
			int n=sc.nextInt();
			long []a=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			Arrays.sort(a);
			long min=a[1]-a[0];
			for(int i=0;i<n-1;i++)
			{
				if((Math.abs(a[i]-a[i+1]))<min)
				{
					min=Math.abs(a[i]-a[i+1]);
				}
			}
			System.out.println(min);
				
		}
	}

}