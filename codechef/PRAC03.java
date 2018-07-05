import java.util.*;
class PRAC03
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			int k=a[i];
			int k1=a[i+1];
			int m=k%10;
			int m1=k1/10;
			if(m!=m1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}