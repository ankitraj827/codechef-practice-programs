import java.util.*;
class MC4
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int []a=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{  
			int h1=sc.nextInt();
			int h2=sc.nextInt();
			int sum=a[h1-1];
			for(int j=h1;j<=h2-1;j++)
			{
				sum=sum^a[j];
			}
			System.out.println(sum^2147483647);
			System.out.println(sum);
		}
	}
}