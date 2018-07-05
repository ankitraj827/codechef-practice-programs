import java.util.*;
class FB
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<Integer.parseInt(str);i++)
		{
				String str1=sc.nextLine();
				int count=0;
				int count1=0;
				String str2="";
				String str3="";
				for(int j=0;j<Integer.parseInt(str1);j++)
				{
					String str4=sc.nextLine();
					if(str2.equals(""))
					{
						count++;
						str2=str2+str4;
					}
					else if(str3.equals(""))
					{
						if(str2.equals(str4))
						{
							count++;
						}
						else
						{
							count1++;
							str3=str3+str4;
						}
					}
					else
					{
						if(str2.equals(str4))
						{
							count++;
						}
						else if(str3.equals(str4))
						{
							count1++;
						}
					}	
				}
				//System.out.println(count+" "+count1);
				if(count==count1)
				{
					System.out.println("Draw");
				}
				else if(count>count1)
				{
					System.out.println(str2);
				}
				else
				{
					System.out.println(str3);
				}
		}
		
	}
}