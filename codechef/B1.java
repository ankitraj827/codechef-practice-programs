import java.util.*;
class B1
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i1=0;i1<n;i1++)
		{
			int n1=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<n1;i++)
			{
				int m=sc.nextInt();
				al.add(m);
			}
			int j=0;
			int k=0;
			outer:
			while(k<al.size())
			{
				j=k+1;
				while(j<al.size())
				{
					int sum=al.get(k)+al.get(j);
					//System.out.println(sum);
					if(sum%2==0)
					{
						al.remove(k);
						//System.out.println(al);
						al.remove(j-1);
						al.add(sum);
						//System.out.println(al);
						k=0;
						continue outer;
					}
					j++;
				}
				k++;
				//System.out.println(al);
			}
			System.out.println(al.size());
		}
	}
}