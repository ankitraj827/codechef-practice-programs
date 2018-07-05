import java.util.*;
class GO
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<Integer.parseInt(str);i++)
		{
			String str1=sc.nextLine();
			String []a=str1.split(" ");
			String str2=sc.nextLine();
			int up=0;
			int lc=0;
			for(int j=0;j<str2.length();j++)
			{
				char ch=str2.charAt(j);
				if(Character.isLowerCase(ch))
				{
					lc++;
				}
				else if(Character.isUpperCase(ch))
				{
					up++;
				}
			}
			if(up<=Integer.parseInt(a[1]) && lc>Integer.parseInt(a[1]))
			{
				System.out.println("chef");
			}
			else if(lc<=Integer.parseInt(a[1]) && up>Integer.parseInt(a[1]))
			{
				System.out.println("brother");
			}
			else if(lc<=Integer.parseInt(a[1]) && up<=Integer.parseInt(a[1]))
			{
				System.out.println("both");
			}
			else
			{
				System.out.println("none");
			}
		}
	}


}