import java.util.*;
class NOTINCOM
{
	public static void main(String []rk)
	{
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int i1=0;i1<t;i1++)
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				ArrayList<Integer> al=new ArrayList<>();
				for(int i=0;i<n1;i++)
				{
					int k=sc.nextInt();
					al.add(k);
				}
				Collections.sort(al);
				int count=0;
				for(int i=0;i<n2;i++)
				{
					int k=sc.nextInt();
					if(Collections.binarySearch(al,k)>=0)
					{
						count++;
						al.remove(Collections.binarySearch(al,k));
					}
				}
				System.out.println(count);
				
			}
	}
}