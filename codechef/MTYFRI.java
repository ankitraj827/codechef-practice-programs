import java.util.*;
class MTYFRI
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i1=0;i1<n;i1++)
		{
			int m=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			ArrayList<Integer> al1=new ArrayList<>();
			for(int i=0;i<m;i++)
			{
				if(i%2==0)
				{
					al.add(sc.nextInt());
				}
				else
				{
					al1.add(sc.nextInt());
				}
			}
			Collections.sort(al);
			Collections.sort(al1);
			if(k==0)
			{
				int summotu=0;
				int sumtonu=0;
				for(int i=0;i<al.size();i++)
				{
					summotu=summotu+al.get(i);
				} 
				for(int i=0;i<al1.size();i++)
				{
					sumtonu=sumtonu+al1.get(i);
				}
				if(sumtonu>summotu)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			else
			{
				for(int i=0;i<k;i++)
				{
					int m1=al.get(al.size()-1);
					int m2=al1.get(0);
					if(m1>m2)
					{
						al.remove(al.size()-1);
						al.add(al.size()-1,m2);
						al1.remove(0);
						al1.add(m1);
					}
					else
					{
						break;
					}
				}
				int summotu=0;
				int sumtonu=0;
				for(int i=0;i<al.size();i++)
				{
					summotu=summotu+al.get(i);
				} 
				for(int i=0;i<al1.size();i++)
				{
					sumtonu=sumtonu+al1.get(i);
				}
				if(sumtonu>summotu)
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