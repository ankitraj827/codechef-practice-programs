import java.util.*;
class CHEFA
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int []a=new int[n1];
			int sum=0;
			for(int j=0;j<n1;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			for(int j=0;j<n1;j++)
			{
				if(j%2==0)
				{
					sum=sum+a[j];
				}
			}
			System.out.println(sum);
		}
	}

}