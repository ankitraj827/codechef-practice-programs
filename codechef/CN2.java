import java.util.*;
class CN2
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		outer:
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int g=sc.nextInt();
			int h=sc.nextInt();
			int k=sc.nextInt();
			int []a=new int[n1];
			for(int j=0;j<n1;j++)
			{
				a[j]=sc.nextInt();
			}
			if(k>n1)
			{
				System.out.println("Impossible");
				continue outer;
			}
			else
			{
				int g1=g*k;
				int h1=0;
				for(int j=0;j<k;j++)
				{
					h1=h1+a[j];
				}
				h1=h1*h;
				if(g1==h1)
				{
					System.out.println("Impossible");
					continue outer;	
				}
				else if(g1<h1)
				{
					System.out.println("Gagan");
				}
				else
				{
					System.out.println("Himanshu");
				}
	
			}
			

		}

	}
}