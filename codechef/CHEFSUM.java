import java.util.*;
class CHEFSUM
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int []a=new int[n1];
			for(int j=0;j<n1;j++)
			{
				a[j]=sc.nextInt();
			}
			int min=99999;
			int result=0;
			for(int j=0;j<n1;j++)
			{
				int prefixsum=0;
				int suffixsum=0;
				for(int k=0;k<=j;k++)
				{
					prefixsum=prefixsum+a[k];
				}
				for(int k=a.length-(a.length-j);k<a.length;k++)
				{
					suffixsum=suffixsum+a[k];
				}
				int sum1=prefixsum+suffixsum;
				if(sum1<min)
				{
					min=sum1;
					result=j;
				}
			}
			System.out.println(result+1);
		}
	}

}