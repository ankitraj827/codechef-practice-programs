import java.util.*;
class SINS
{
	public static void main(String rk[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i1=0;i1<n;i1++)
		{
			int M=sc.nextInt();
			int B=sc.nextInt();
			while(M!=B && M!=0 && B!=0)
			{
				if(M>B)
				{
					M=M-B;
				}
				else
				{
					B=B-M;
				}
			}
			System.out.println(M+B);
		}
	}
}