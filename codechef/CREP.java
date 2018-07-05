import java.util.*;
class CREP
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int []a=new int[n1];
			int k=sc.nextInt();
			TreeSet<Integer> t1=new TreeSet<>();
			for(int j=0;j<n1;j++)
			{
				a[j]=sc.nextInt();
				t1.add(a[j]);	
			}
			Iterator it=t1.iterator();
			long sum=0;
			int flag=0;
			while(it.hasNext())
			{
				int m=(int)it.next();
				int count=0;
				for(int j=0;j<n1;j++)
				{
					if(a[j]==m)
					{
						count++;
					}
				}
				if(count==k)
				{
					flag=1;
					sum=sum+m;
				}
			}
			if(flag==0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(sum);
			}
		}
	}

}