import java.util.*;
class CUTBOARD
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			n1=n1-1;
			n2=n2-1;
			System.out.println(n1*n2);
		}
	}

}