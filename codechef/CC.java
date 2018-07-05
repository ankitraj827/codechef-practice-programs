import java.util.*;
class CC
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		int i=2;
		int k=n2;
		while(k<=n1)
		{
			al.add(k);
			k=n2*i;
			i++;
		}
		int j=2;
		k=n3;
		while(k<=n1)
		{
			al1.add(k);
			k=n3*j;
			j++;
		}
		for(i=0;i<al.size();i++)
		{
			int k1=al.get(i);
			for(j=0;j<al1.size();j++)
			{
				if(k1==al1.get(j))
				{
					al.remove(i);
					al1.remove(j);
				}
			}
		}
		if(al.size()>al1.size())
		{
			System.out.println("AYUSH "+(al.size()-al1.size()));
		}
		else if(al.size()==al1.size())
		{
			System.out.println("TIE");
		}
		else
		{
			System.out.println("SAMEER "+(al1.size()-al.size()));
		}

	}




}