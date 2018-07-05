import java.util.*;
import java.io.*;
class NUM239
{
	public static void main(String []rk) throws IOException
	{
		InputStreamReader inr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inr);
		int n=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<n;i++)
		{
			String str=br.readLine();
			String []a=str.split(" ");
			int n1=Integer.parseInt(a[0]);
			int n2=Integer.parseInt(a[1]);
			int count=0;
			for(int j=n1;j<=n2;j++)
			{
				if(j%10==2 || j%10==3 || j%10==9)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}