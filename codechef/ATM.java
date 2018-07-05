import java.util.*;
class ATM
{
	public static void main(String rk[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float bal=sc.nextFloat();
		if(n%5!=0 || n>=bal)
		{
			System.out.printf("%.2f",bal);
		}
		else
		{
			float result=bal-n-0.5f;
			System.out.printf("%.2f",result);
		}
	}
}