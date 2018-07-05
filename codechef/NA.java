import java.util.*;
class NA
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<Integer.parseInt(n);i++)
		{
			ArrayList<Integer> al=new ArrayList<>();
			ArrayList<Integer> al1=new ArrayList<>();
			String s=sc.nextLine();
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='A')
				{
					al.add(j);
				}
				if(s.charAt(j)=='B')
				{
					al1.add(j);
				}
			}
			int count=0;
			int count1=0;
			if(al.size()==1)
			{
				count=1;
			}
			else if(!al.isEmpty())
			{
				//System.out.println(al);
				for(int j=0;j<al.size()-1;j++)
				{
					String s1=s.substring(al.get(j)+1,al.get(j+1));
					//System.out.println(s1);
					outer:
					if(s1.indexOf('B')>=0)
					{
						continue;
					}
					else
					{
						count=count+s1.length();
					}
						
				}
				count=count+al.size();
				//System.out.println(count);
			}
			if(al1.size()==1)
			{
				count1=1;
			}
			else if(!al1.isEmpty())
			{
				//System.out.println(al1);
				for(int j=0;j<al1.size()-1;j++)
				{
					//System.out.println(al);
					String s1=s.substring(al1.get(j)+1,al1.get(j+1));
					//System.out.println(s1);
					outer:
					if(s1.indexOf('A')>=0)
					{
						continue;
					}
					else
					{
						count1=count1+s1.length();
					}
					//System.out.println(count1);	
				}
				count1=count1+al1.size();		

			}
			System.out.println(count+" "+count1);
		}
	}




}