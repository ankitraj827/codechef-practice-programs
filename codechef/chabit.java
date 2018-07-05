import java.util.*;
class Sol3
{
	
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			a[i]=calculate(m,sc);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	static int calculate(int e,Scanner in)
	{
		int[] m=new int[e];
		for(int j=0;j<e;j++)
		{
			m[j]=in.nextInt();
		}
		int k=m[0];
		for(int i=1;i<e;i++)
		{
			k=k|m[i];
		}
		return k;

	}



}