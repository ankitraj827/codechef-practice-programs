import java.util.*;
class ANKTRAIN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int n1=sc.nextInt();
				int k=n1/8;
				int m=n1%8;
				if(m==1)
				{
					System.out.println((8*k+4)+"LB");
				}
				else if(m==2)
				{
					System.out.println((8*k+5)+"MB");
				}
				else if(m==3)
				{
					System.out.println((8*k+6)+"UB");
				}
				else if(m==4)
				{
					System.out.println((8*k+1)+"LB");
				}
				else if(m==5)
				{
					System.out.println((8*k+2)+"MB");
				}
				else if(m==6)
				{
					System.out.println((8*k+3)+"UB");
				}
				else if(m==7)
				{
					System.out.println((8*k+8)+"SU");
				}
				else
				{
					System.out.println((8*k-1)+"SL");
				}
			}
		}

}