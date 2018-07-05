import java.util.*;
class GOODPREF
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		outer:
		for(int i1=0;i1<n;i1++)
		{
			String str=sc.nextLine();
			String []a=str.split(" ");
			String str1=a[0];
			String strt=a[0];
			int count1=0;
			int count2=0;
			int count3=0;
			for(int i=0;i<str1.length();i++)
			{
				char ch=str1.charAt(i);
				if(ch=='a')
				{
					count1++;
				}
				else
				{
					count2++;
				}
				if(count1>count2)
				{
					count3++;
				}
			}
			if(count3==0)
			{
				System.out.println("0");
				continue outer;
			}
			for(int i=0;i<Integer.parseInt(a[1])-1;i++)
			{
				str1=str1+strt;
			}
			int counta=0;
			int countb=0;
			int count=0;
			for(int i=0;i<str1.length();i++)
			{
				char ch=str1.charAt(i);
				if(ch=='a')
				{
					counta++;
				}
				else
				{
					countb++;
				}
				if(counta>countb)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}