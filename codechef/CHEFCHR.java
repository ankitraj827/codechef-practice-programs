import java.util.*;
import java.io.*;
import java.util.regex.*;
class CHEFCHR
{
	public static void main(String rk[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			String str=br.readLine();
			int count=0;
			for(int j=0;j<str.length()-3;j++)
			{
				String str2=str.substring(j,j+4);
				if(str2.contains("c") && str2.contains("h") && str2.contains("e") && str2.contains("f"))
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("normal");
			}
			else
			{
				System.out.println("lovely "+count);
			}
		}
	}
}