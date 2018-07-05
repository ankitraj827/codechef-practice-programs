import java.util.*;
class FRIEZA
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String str="frieza";
		for(int i1=0;i1<n;i1++)
		{
			String s=sc.nextLine();
			int count;
			int flag=0;
			int i=0;
			outer:
			while(i<s.length())
			{
				count=0;
				char ch=s.charAt(i);
				if(str.indexOf(ch)>=0)
				{
					count=1;
					for(int j=i+1;j<s.length();j++)
					{
						char ch2=s.charAt(j);
						if(str.indexOf(ch2)>=0)
						{
							count++;
						}
						else
						{
							break;
						}
					}
					if(count==1)
					{
						i++;
					}
					else
					{
						i=i+count;
					}
					System.out.print(count);
				}
				else if(str.indexOf(ch)<0)
				{
					count=1;
					for(int j=i+1;j<s.length();j++)
					{
						char ch2=s.charAt(j);
						if(str.indexOf(ch2)<0)
						{
							count++;
						}
						else
						{
							break;
						}
					}
					if(count==1)
					{
						i++;
					}
					else
					{
						i=i+count;
					}
					System.out.print(count);	
				}
			}
			System.out.println();
		}
	}
}