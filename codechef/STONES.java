import java.util.*;
class STONES
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i1=0;i1<n;i1++)
		{
			HashMap<Character,Integer> h1=new HashMap<>();
			String str=sc.nextLine();
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				h1.put(ch,1);
			}
			int count=0;
			String str2=sc.nextLine();
			for(int i=0;i<str2.length();i++)
			{
				char ch=str2.charAt(i);
				if(h1.containsKey(ch))
				{
					count++;
				}
			}
			System.out.println(count);
			
		}
	}
}