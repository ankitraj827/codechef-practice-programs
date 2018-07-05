import java.util.*;
class NITIKA
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			String []a=str.split(" ");
			if(a.length==1)
			{
				str=str.toLowerCase();
				String str1="";
				str1=str1+str.charAt(0);
				str1=str1.toUpperCase();
				str1=str1+str.substring(1,str.length());
				System.out.println(str1);	
			}
			else
			{
				String str1="";
				for(int j=0;j<a.length-1;j++)
				{
					String str2=a[j];
					String str5=""+str2.charAt(0);
					str5=str5.toUpperCase();
					str1=str1+str5+". ";
				}
				String str3=a[a.length-1];
				str3=str3.toLowerCase();
				String str4="";
				str4=str4+str3.charAt(0);
				str4=str4.toUpperCase();
				str4=str4+str3.substring(1,str3.length());
				str1=str1+str4;
				System.out.println(str1);
			}
		}
	}
}