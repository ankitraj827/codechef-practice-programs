import java.util.*;
class AYUGF
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			int K=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			ArrayList<Integer> al1=new ArrayList<>();
			int i=N;
			while(i<=K)
			{
				al.add(i);
				i=i+N;
			}
			i=M;
			while(i<=K)
			{
				al1.add(i);
				i=i+M;
			}
			int count=0;
			for(int k=0;k<al1.size();k++)
			{
				int m=al1.get(k);
				if(al.indexOf(m)>=0)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}