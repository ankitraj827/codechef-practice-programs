import java.util.*;
class Demo2
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int []d=new int[a[0]];
		for(int n=0;n<a[0];n++)
		{
			d[i]=sc.nextInt();
		}
		String []s=new String[Integer.parseInt(a[1])];
		String []p=new String[Integer.parseInt(a[1])];
		for(int i=0;i<Integer.parseInt(a[1]);i++)
		{
			String str4=sc.nextLine();
			s[i]=str4;
		}
		calculate(s,d);
		
	static void calculate(String []o,int []l)
	{
				
		int max=0;
		for(int j=0;j<o.length;j++)
		{
			String []i=o[j].split(" ");
			if(i[1]>max)
			{
				max=i[1];
			}
				
		}
		for(int i=0;i<l.length;i++)
		{
			int k=l[i];
			for(int j=0;j<o.length;j++)
			{
				String []i=o[j].split(" ");
				if(k==o
				
			}
			
		}

	}
}