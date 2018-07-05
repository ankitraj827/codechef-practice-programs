import java.util.*;
class CODE1
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int sum1=0;
			for(int j=0;j<n1;j++)
			{
				int k=sc.nextInt();
				sum1=sum1+k;
			}
			int n2=sc.nextInt();
			int sum2=0;
			for(int j=0;j<n2;j++)
			{
				int k=sc.nextInt();
				sum2=sum2+k;
			}
			if(sum1==sum2)
			{
				System.out.println("A");
			}
			else if(sum1>sum2)
			{
				System.out.println("B");
			}
			else
			{
				System.out.println("A");
			}
		}
	}

}