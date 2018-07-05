import java.util.*;
class COU
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int city1=0;
			int city2=0;
			int city3=0;
			int maxd1=0;
			int maxd2=0;
			int maxd3=0;
			for(int j=0;j<n1;j++)
			{
				int c=sc.nextInt();
				int l=sc.nextInt();
				int d=sc.nextInt();
				if(l==1)
				{
					if(d>maxd1)
					{
						maxd1=d;
						city1=c;
					}
					else if(d==maxd1)
					{
						if(c<city1)
						{
							city1=c;
						}
					}
				}
				else if(l==2)
				{
					if(d>maxd2)
					{
						maxd2=d;
						city2=c;
					}
					else if(d==maxd2)
					{
						if(c<city2)
						{
							city2=c;
						}
					}
				}
				else if(l==3)
				{
					if(d>maxd3)
					{
						maxd3=d;
						city3=c;
					}
					else if(d==maxd3)
					{
						if(c<city3)
						{
							city3=c;
						}
					}
				}
	
			}
			System.out.println(maxd1+" "+city1);
			System.out.println(maxd2+" "+city2);
			System.out.println(maxd3+" "+city3);
			
		}
	}


}