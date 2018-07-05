import java.util.*;
class Demo
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		int []a=new int[t];
		for(int i=0;i<t;i++)
		{
			String str=sc.nextLine();
			a[i]=calculate(str);
		}
		for(int j=0;j<t;j++)
		{
			System.out.println(a[j]);
		}
	}
	static int calculate(String m)
	{
		String []a=m.split(" ");
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(String k:a)
		{
			al.add(Integer.parseInt(k));
		}
		int f=al.size()-1;
		for(int i=0;i<al.size();i++)
		{
			
			if(al.get(i)==f)
			{
				al.remove(i);
			}

		}
		Collections.sort(al);
		return al.get(al.size()-1);

	}

}