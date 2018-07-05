import java.io.*;
import java.util.*;
class CLFIBD
{
	public static void main(String []rk) throws IOException
	{
		InputStreamReader inr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inr);
		int n=Integer.parseInt(br.readLine());
		while(n-- > 0)
		{
			String str=br.readLine();
			ArrayList<Character> al5=new ArrayList<>();
			TreeSet<Character> t1=new TreeSet<>();
			for(int i=0;i<str.length();i++)
			{
				int o=(int)str.charAt(i);
				if(o<=122 && o>=97)
				{
					t1.add(str.charAt(i));
					al5.add(str.charAt(i));
				}
			}
			if(t1.size()<3)
			{
				System.out.println("Dynamic");
				continue;
			}
			Collections.sort(al5);
			Iterator it=t1.iterator();
			ArrayList<Integer> al2=new ArrayList<>();
			int j=0;
			outer:
			while(it.hasNext())
			{
				char ch=(char)it.next();
				//System.out.println(ch);
				int count=0;
				while(j<al5.size())
				{
					//System.out.println(al5.get(j));
					if(ch==al5.get(j) && j==al5.size()-1)
					{
						count++;
						j++;
						al2.add(count);
					}
					else if(ch==al5.get(j))
					{
						count++;
						j++;
					}
					else
					{
						al2.add(count);
						continue outer;
					}
				}
			}
			Collections.sort(al2);
			int flag=0;
			for(int i=0;i<al2.size()-2;i++)
			{
				int m1=al2.get(i);
				int m2=al2.get(i+1);
				int m3=al2.get(i+2);
				if((m1+m2)==m3)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("Not");
			}
			else
			{
				System.out.println("Dynamic");
			}
			
		}
	}
}