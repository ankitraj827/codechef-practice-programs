import java.util.*;
class ERROR
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i1=0;i1<n;i1++)
		{
			String str=sc.nextLine();
			if(str.indexOf("010")>=0 || str.indexOf("101")>=0)
			{
				System.out.println("Good");
			}
			else
			{
				System.out.println("Bad");
			}
		}
	}
}