import java.util.*;
class ELEVSTRS
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			double t1=(n1*Math.sqrt(2))/v1;
			double t2=(double)2*n1/v2;
			if(t1<t2)
			{
				System.out.println("Stairs");
			}
			else
			{
				System.out.println("Elevator");
			}
		}
	}
}