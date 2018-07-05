import java.util.*;
class CI
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int p1=sc.nextInt();
			int p2=sc.nextInt();
			int m=sc.nextInt();
			int k=(p2-p1)+1;
			int k1=m%k;
			if(k1==0)
			{
				System.out.println(p2);
			}
			else if(k1==1)
			{
				System.out.println(p1);
			}
			else
			{
				System.out.println(p1+(k1-1));
			}
		}	
	}
}