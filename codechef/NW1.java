import java.util.*;
class NW1
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i1=0;i1<n;i1++)
		{
			String str=sc.nextLine();
			String []a=str.split(" ");
			int m1=Integer.parseInt(a[0])%7;
			if(m1==0)
			{
				int j=0;
				while(j<6)
				{
					System.out.print("4 ");
					j++;
				}
				System.out.print("4");
			}
			else
			{
				int []a1=new int[7];
				Arrays.fill(a1,4);
				int temp=7;
				if(a[1].equals("mon"))
				{
					temp=1;
				}
				else if(a[1].equals("tues"))
				{
					temp=2;
				}
				else if(a[1].equals("wed"))
				{
					temp=3;
				}
				else if(a[1].equals("thurs"))
				{
					temp=4;
				}
				else if(a[1].equals("fri"))
				{
					temp=5;
				}
				else if(a[1].equals("sat"))
				{
					temp=6;
				}
				int j=0,i=temp-1;
				while(j<m1)
				{
					a1[i]=5;
					i++;
					if(i>6)
					{
						i=0;
					}
					j++;	
				}
				for(int k=0;k<a1.length-1;k++)
				{
					System.out.print(a1[k]+" ");
				}
				System.out.print(a1[a1.length-1]);
			}
			System.out.println();
		}	
	}
}