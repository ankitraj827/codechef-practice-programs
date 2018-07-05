import java.util.*;
class SEGM
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			int m=str.indexOf('1');
			int m1=str.indexOf('0');
			if(m<0)
			{
				System.out.println("NO");
			}
			else if(m1<0)
			{
				System.out.println("YES");
			}
			else
			{
				String str1=str.substring(m,str.length());
				//System.out.println(str1);
				int k2=str1.indexOf('0');
				if(k2<0)
				{
					System.out.println("YES");
				}
				else
				{
				//System.out.println(k2);
				String str2=str1.substring(k2,str1.length());
				//System.out.println(str2);
				int k3=str2.indexOf('1');
				//System.out.println(k3);
				if(k3>=0)
				{
					System.out.println("NO");
				}
				else
				{
					System.out.println("YES");
				}
				}
				
				
			}
		}
	}

}