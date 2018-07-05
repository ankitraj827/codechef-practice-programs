import java.util.*;
class CKMEDI
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			for(int j=0;j<n1;j++)
			{
				al.add(sc.nextInt());
			}
			Collections.sort(al);
			k=(n1+k)/2;
			System.out.println(al.get(k));
		}
	}
}