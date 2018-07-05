import java.util.*;
class US
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<Integer.parseInt(n);i++)
		{
			String str=sc.nextLine();
			String str1=str;
			String p1="01";
			String p2="10";
			int j=0;
			int count=0;
			outer:
			while(j<str1.length()-1)
			{
				if(str1.indexOf(p1)>=0)
				{
					int m=str1.indexOf(p1);
					count++;
					str1=str1.substring(m+2,str1.length());
					//System.out.println(str1);
					continue outer;
				}
				j++;
			}
			String str2=str;
			j=0;
			outer:
			while(j<str2.length()-1)
			{
				if(str2.indexOf(p2)>=0)
				{
					int m=str2.indexOf(p2);
					count++;
					str2=str2.substring(m+2,str2.length());
					//System.out.println(str2);
					continue outer;
				}
				j++;
			}
			//System.out.println(count);
			if(count<=2)
			{
				System.out.println("uniform");
			}
			else
			{
				System.out.println("non-uniform");
			}
			
		}
	}

}