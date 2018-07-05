import java.util.*;
class JOHNY
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
				al.add(sc.nextInt());
			}
			int k=sc.nextInt();
			int m=al.get(k-1);
			Collections.sort(al);
			System.out.println(Collections.binarySearch(al,m)+1);
		}
	}

}