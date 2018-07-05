import java.util.*;
class MCH
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n2=sc.nextInt();
			int []f=new int[n2];
			for(int j=0;j<f.length;j++)
			{
				f[j]=sc.nextInt();
			}
			ArrayList<Integer> al=new ArrayList<>();
			for(int j=0;j<n2;j++)
			{
				int m=sc.nextInt();
				al.add(m);
			}
			int flag=0,flag1=0;
			outer:
			for(int j=0;j<f.length;j++)
			{
				if(f[j]<=al.get(j))
				{
					continue outer;
				}
				else
				{
					flag=1;
					break outer;
				}
			}
			Collections.reverse(al);
			outer:
			for(int j=0;j<f.length;j++)
			{
				if(f[j]<=al.get(j))
				{
					continue outer;
				}
				else
				{
					flag1=1;
					break outer;
				}
			}
			if(flag==0 && flag1==1)
			{
				System.out.println("front");
			}
			else if(flag1==0 && flag==1)
			{
				System.out.println("back");
			}
			else if(flag==0 && flag1==0)
			{
				System.out.println("both");
			}
			else
			{
				System.out.println("none");
			}
			
		}
	}

}