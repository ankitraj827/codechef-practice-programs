import java.util.*;
class CHEFRUN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			double d1=sc.nextDouble();
			double d2=sc.nextDouble();
			double d3=sc.nextDouble();
			double d4=sc.nextDouble();
			double d5=sc.nextDouble();
			d1=d3-d1;
			d2=d2-d3;
			if((d1/d4)>(d2/d5))
			{
				System.out.println("Kefa");
			}
			else if((d1/d4)==(d2/d5))
			{
				System.out.println("Draw");
			}
			else
			{
				System.out.println("Chef");
			}
		}
	}

}