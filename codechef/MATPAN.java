import java.util.*;
class MATPAN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> al=new ArrayList<>();
			for(int j=0;j<26;j++)
			{
				int m=Integer.parseInt(sc.nextLine());
				al.add(m);
			}
			String str=sc.nextLine();
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				int m=(int)ch;
				m=m-97;
				al.set(m,0);
			}
			int sum=0;
			for(int j=0;j<al.size();j++)
			{
				sum=sum+al.get(j);
			}
			System.out.println(sum);
			
			
		}
	}

}