import java.util.*;
class COOMILK
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i1=0;i1<n;i1++)
		{
			int n1=Integer.parseInt(sc.nextLine());
			String str=sc.nextLine();
			String []a=str.split(" ");
			int i=0;
			int flag=0;
			outer:
			while(i<a.length)
			{
				if(a[i].equals("cookie"))
				{
					if((i+1)==a.length)
					{
						flag=1;
						break outer;
					}
					else if(a[i+1].equals("milk"))
					{
						i=i+2;
						continue outer;
					}
					else
					{
						flag=1;
						break outer;
					}
				}
				i++;	
			}
			if(flag==1)
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