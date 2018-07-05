import java.util.*;
class COOK9
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1 && n>100)
		{
			return;
		}
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			if(n1<2 && n1>100)
			{
				continue;
			}
			int []al=new int[n1];
			int []bo=new int[n1];
			int max=0,max1=0;
			for(int j=0;j<n1;j++)
			{
				al[j]=sc.nextInt();
				if(al[j]>max)
				{
					max=al[j];
				}
			}
			for(int j=0;j<n1;j++)
			{
				bo[j]=sc.nextInt();
				if(bo[j]>max1)
				{
					max1=bo[j];
				}
			}
			int alsum=0;
			int bosum=0;
			for(int j=0;j<n1;j++)
			{
				if(al[j]!=max)
				{
					alsum=alsum+al[j];
				}
				if(bo[j]!=max1)
				{
					bosum=bosum+bo[j];
				}
			}
			if(alsum==bosum)
			{
				System.out.println("Draw");
			}
			else if(alsum>bosum)
			{
				System.out.println("Bob");
			}
			else
			{
				System.out.println("Alice");
			}
		}


	}

}