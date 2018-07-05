import java.util.*;
class PREFCONT
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int hard=n2/10;
			int catewalk=n2/2;
			int hcount=0;
			int ccount=0;
			for(int j=0;j<n1;j++)
			{
				int k=sc.nextInt();
				if(k<=hard)
				{
					hcount++;
				}
				else if(k>=catewalk)
				{
					ccount++;
				}
			}
			if(hcount==2 && ccount==1)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}

}