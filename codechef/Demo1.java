import java.util.*;
class Demo
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int p=sc.nextInt();
			int hard=0;
			int ct=0;
			int []a=new int[n1];
			for(int j=0;j<n1;j++)
			{
				a[j]=sc.nextInt();
				if(a[j]>=p/2)
				{
					ct++;
				}
				else if(a[j]<=p/10)
				{
					//System.out.println("Hello");
					hard++;
				}
				//System.out.println(hard+" "+ct);
			}
			if(ct==1 && hard==2)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}

		}


	}


}