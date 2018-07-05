import java.util.*;
class R
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			TreeSet<Integer> t1=new TreeSet<>();
			int flag=0;
			int a[]=new int[4];
			for(int j=0;j<4;j++)
			{
				a[j]=sc.nextInt();
				t1.add(a[j]);
			}
			if(t1.size()>2)
			{
				System.out.println("NO");
			}
			else
			{
				Iterator it=t1.iterator();
				outer:
				while(it.hasNext())
				{
					int m=(int)it.next();
					int count=0;
					for(int k=0;k<4;k++)
					{
						if(m==a[k])
						{
							count++;
						}
					}
					if(count==2)
					{
						flag=1;
						continue;
					}
					else if(count==4)
					{
						flag=1;
						continue;
					}
					else
					{
						flag=0;
						break outer;
					}
				}
				if(flag==1)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}	

		}



	}


}