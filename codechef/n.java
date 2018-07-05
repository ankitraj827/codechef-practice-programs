import java.util.*;
class N
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<Integer.parseInt(n);i++)
		{
			String s=sc.nextLine();
			int count=0;
			int count1=0;
			int j=0;
			while(j<s.length())
			{
				if(s.charAt(j)=='A')
				{
					String k1=s.substring(j+1,s.length());
					System.out.println(k1);
					outer:
					for(int p=0;p<k1.length();p++)
					{
						if(k1.charAt(p)=='A')
						{
							count=count+p-j+1;
							j=j+p;
						}
						if(k1.charAt(p)=='B')
						{
							break outer;
						}
					}
				}
				else if(s.charAt(j)=='B')
				{
					String k1=s.substring(j+1,s.length());
					outer:
					for(int p=0;p<k1.length();p++)
					{
						if(k1.charAt(p)=='B')
						{
							count1=count1+p-j+1;
							j=j+p;
						}
						if(k1.charAt(p)=='A')
						{
							break outer;
						}
					}					

				}
				j++;
			}
			System.out.println(count+" "+count1);
		}

	}



}