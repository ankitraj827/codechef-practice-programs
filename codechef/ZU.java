import java.util.*;
import java.io.*;
class ZU
{
	public static void main(String []rk) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n1=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n1;i++)
		{
            String str=sc.nextLine();
            String []a=str.split(" ");
            String str1=sc.nextLine();
            String []a1=str1.split(" ");
            String str3=sc.nextLine();
            String str4=sc.nextLine();
            int x=0,y=0;
			for(int j=0;j<str4.length();j++)
			{
				if(str4.charAt(j)=='L')
				{
					x--;
				}
				else if(str4.charAt(j)=='U')
				{
					y++;
				}
				else if(str4.charAt(j)=='D')
				{
					y--;
				}
				else if(str4.charAt(j)=='R')
				{
					x++;
				}
			}
            int x1=Integer.parseInt(a1[0]);
            int y1=Integer.parseInt(a1[1]);
			if(x==x1 && y==y1)
			{
				System.out.println("REACHED");
			}
			else if(x<0 || x>Integer.parseInt(a[0])|| y<0 || y>Integer.parseInt(a[1]))
			{
				System.out.println("DANGER");
			}
			else
			{
				System.out.println("SOMEWHERE");
			}
		}
	}

}