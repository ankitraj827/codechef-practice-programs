import java.util.*;
class CHEFWORK
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(b[i]==1)
			{
				al1.add(a[i]);
			}
			else if(b[i]==2)
			{
				al2.add(a[i]);
			}
			else
			{
				al3.add(a[i]);
			}
		}
		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);
		if(!al3.isEmpty() && !al1.isEmpty() && !al2.isEmpty())
		{
			if(al1.get(0)+al2.get(0)<=al3.get(0))
			{
				System.out.println(al1.get(0)+al2.get(0));
			}
			else
			{
				System.out.println(al3.get(0));
			}
		}
		else if(al1.isEmpty() || al2.isEmpty() && !al3.isEmpty())
		{
			System.out.println(al3.get(0));
		}
		else if(al3.isEmpty())
		{
			System.out.println(al1.get(0)+al2.get(0));
		}
	}

}