import java.util.*;
class XORAGN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
			int n=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				int k1=sc.nextInt();
				al.add(k1*2);
			}
			int sum=0;
			for(int i=0;i<al.size();i++)
			{
				sum=sum^al.get(i);
			}
			System.out.println(sum);
		}	
	}
}