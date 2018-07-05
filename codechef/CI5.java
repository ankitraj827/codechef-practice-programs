import java.util.*;
class CI5
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []str1=str.split(" ");
		String str2=sc.nextLine();
		ArrayList<Character> al=new ArrayList<>();
		
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			al.add(ch);
		}
		int j=0;
		while(j<al.size())
		{
			char m=al.get(j);
			int flag=0;
			int m1=0;
			outer:
			for(int k=j;k<(j+Integer.parseInt(str1[1])) && k<al.size();k++)
			{
				if(m==al.get(k))
				{
					m1=1;
					continue outer;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==0 && m1==1)
			{
				al.remove(j);
				for(int k=j+1;k<=(j+Integer.parseInt(str1[1])-1) && k<al.size();k++)
				{
					k=k-1;
					al.remove(k);
				}
				j=0;
			}
			else
			{
				j++;
			}
			System.out.println(al);	

		}
	}


}