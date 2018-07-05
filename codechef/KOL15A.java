import java.util.*;
class KOL15A
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			int sum=0;
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				int m=(int)ch;
				if(m>=48 && m<=57)
				{
					sum=sum+m-48;
				}
			}
			System.out.printf("%d",sum);
		}
	}

}