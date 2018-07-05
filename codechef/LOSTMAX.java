import java.util.*;
class LOSTMAX
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i1=0;i1<n;i1++)
		{
			String str=sc.nextLine();
			String []a=str.split(" ");
			int m=a.length;
			int max=0;
			for(int i=0;i<a.length;i++)
			{
				int k=Integer.parseInt(a[i]);
				if(k!=m-1 && k>max)
				{
					max=k;
				}
			}
			System.out.println(max);
		}
	}

}