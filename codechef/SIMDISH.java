import java.util.*;
class SIMDISH
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			String []a=str.split(" ");
			int count=0;
			String str2=sc.nextLine();
			String []a1=str2.split(" ");
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a1.length;k++)
				{
					if(a[j].equals(a1[k]))
					{
						count++;
					}
				}
			}
			if(count>=2)
			{
				System.out.println("similar");
			}
			else
			{
				System.out.println("dissimilar");
			}
		}
	}

}