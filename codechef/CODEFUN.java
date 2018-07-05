import java.util.*;
class CODEFUN
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String str="";
			for(int j=0;j<30;j++)
			{
				int n1=sc.nextInt();
				str=str+Integer.toString(n1);
			}
			if(str.indexOf("111111")>=0)
			{
				System.out.println("#coderlifematters");
			}
			else
			{
				System.out.println("#allcodersarefun");
			}
		}
	}


}