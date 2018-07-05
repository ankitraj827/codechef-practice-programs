import java.util.*;
class MCH3
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n2=sc.nextInt();
			int []a=new int[n2];
			TreeSet<Integer> t1=new TreeSet<>();
			for(int j=0;j<a.length;j++)
			{
				a[j]=sc.nextInt();
				t1.add(a[j]);
			}
			int count=0;
			if(t1.size()==a.length)
			{
				System.out.println("0");
			}
			else
			{
				int i1=0;
				outer:
				while(i1<a.length-1)
				{
					//System.out.println(a[i1]+" "+a[i1+1]);
					int mf=a[i1]+a[i1+1];
					//System.out.println(mf);
					int k=t1.size();
					t1.add(mf);
					int k1=t1.size();
					if((k1-k)!=0)
					{
						a[i1+1]=mf;
						i1=0;
						count++;
					}
					if(t1.size()==a.length)
					{
						break outer;
					}
					i1++;
				}
				System.out.println(count);
			}
		}
	}


}