import java.util.*;
class Sol4
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			int []e=new int[3];
			for(int j=0;j<3;j++)
			{
			e[i]=sc.nextInt();
			}
			a[i]=calculate(e);
		}
	}
	static int calculate(int []h)
	{
		int m=h[0];
		int n=h[1];
		public int getm()
		{
			return m;
		}
		public int getn()
		{
			return n;
		}
	}	

}