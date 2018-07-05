import java.util.*;
class FRK
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int count=0;
		for(int i=0;i<n;i++)
		{
			String []a = {"ch","che","ef","chef","he","hef"};
			String str=sc.nextLine();
			outer:
			for(int j=0;j<a.length;j++)
			{
				if(str.indexOf(a[j])>=0)
				{
					count++;
					break outer;
				}
			}
		}
		System.out.println(count);

	}
}