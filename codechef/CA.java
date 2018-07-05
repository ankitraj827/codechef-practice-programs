import java.util.*;
class CA
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n2=sc.nextInt();
		for(int k1=0;k1<n2;k1++)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int flag=0;
		if(a[0]>k)
		{
			outer:
			for(int i=0;i<n;i++)
			{
				if(a[i]<k)
				{
					if(a[i+1]<=a[i-1])
					{
						continue;
					}
					else
					{
						flag=1;
						break outer;
					}
				}	

			}
		}
		else
		{
			outer:
			for(int i=0;i<n;i++)
			{
				if(a[i]>k)
				{
					if(a[i+1]>=a[i-1])
					{
						continue;
					}
					else
					{
						flag=1;
						break outer;
					}
				}	

			}	


		}
		if(flag==1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
	}
}