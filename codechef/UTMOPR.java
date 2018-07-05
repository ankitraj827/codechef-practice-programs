import java.util.*;
class UTMOPR
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i1=0;i1<n;i1++)
		{
			int n1=sc.nextInt();
			int k=sc.nextInt();
			long sum=0;
			for(int i=0;i<n1;i++)
			{
				long k1=sc.nextLong();
				sum=sum+k1;
			}
			if(sum%2!=0)
			{
				System.out.println("even");
			}
			else if(sum%2==0 && k==1)
			{
				System.out.println("odd");
			}
			else
			{
				System.out.println("even");
			}
		}
	}

}