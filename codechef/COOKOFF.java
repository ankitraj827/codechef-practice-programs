import java.util.*;
class COOKOFF
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			int n1=Integer.parseInt(sc.nextLine());
			int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
			int flag=0;
			outer:
			for(int j=0;j<n1;j++)
			{
				String str=sc.nextLine();
				if(str.equals("simple"))
				{
					flag1=1;
				}
				else if(str.equals("cakewalk"))
				{
					flag2=1;
				}
				else if(str.equals("easy"))
				{
					flag3=1;
				}
				else if(str.equals("easy-medium") || str.equals("medium"))
				{
					flag4=1;
				}
				else if(str.equals("medium-hard") || str.equals("hard"))
				{
					flag5=1;
				}
				if((flag1+flag2+flag3+flag4+flag5)==5)
				{
					System.out.println("Yes");
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println("No");
			}
		}
	}
}