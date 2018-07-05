import java.util.*;
class FCO
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String []a=new String[Integer.parseInt(n)];
		for(int i=0;i<Integer.parseInt(n);i++)
		{
			int count=0;
			a[i]=sc.nextLine();
			String []k=a[i].split(" ");
			String ch="1";
			for(int j=0;j<k.length;j++)
			{
				if(k[j].equals(ch))
				{
					count++;
				}	
			}
			//System.out.println(count);
			if(count==0)
			{
				System.out.println("Beginner");
			}
			else if(count==1)
			{
				System.out.println("Junior Developer");
			}
			else if(count==2)
			{
				System.out.println("Middle Developer");
			}
			else if(count==3)
			{
				System.out.println("Senior Developer");
			}
			else if(count==4)
			{
				System.out.println("Hacker");
			}
			else
			{
				System.out.println("Jeff Dean");
			}	
		}
	}

}