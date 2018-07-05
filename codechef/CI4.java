import java.util.*;
import java.lang.Math;
import java.math.BigInteger;
class CI4
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int fact=1;
			for (int j = 2; j <= n2; j++)
			{
            			fact=fact*j;
			}
			BigInteger bi=new BigInteger(""+n1);
			BigInteger bij;
			bij=bi.pow(fact);
			System.out.println(bij);
		}
	}

}