import java.util.*;
class AVGPR
{
	
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		outer:
		for(int i1=0;i1<n;i1++)
		{
			int n1=sc.nextInt();
			int []a=new int[n1];
			int count=0;
			for(int i=0;i<n1;i++)
			{
				a[i]=sc.nextInt();	
			}
			for(int i=0;i<n1;i++)
			{
				int m1=a[i];
				count=count+SumPairs(a,2*m1);
			}
			System.out.println(count);	
		}
	}

}