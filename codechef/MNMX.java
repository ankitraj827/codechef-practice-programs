import java.util.*;
class MNMX
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int j=0;j<n1;j++)
			{	
				int k=sc.nextInt();
				al.add(k);
			}
			Collections.sort(al);
			int sum=0;
			while(al.size()!=1)
			{
				int m1=al.get(0);
				int m2=al.get(1);
				if(m1>m2)
				{
					sum=sum+m2;
					al.remove(0);
				}
				else
				{
					sum=sum+m1;
					al.remove(1);
				}
			}
			System.out.println(sum);
		}
	}
}