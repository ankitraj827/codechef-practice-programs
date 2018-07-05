import java.util.*;
class CN1
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			String s=Integer.toString(i);
			TreeSet<Character> t1=new TreeSet<>();
			for(int j=0;j<s.length();j++)
			{
				t1.add(s.charAt(j));
			}
			if(t1.size()==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}