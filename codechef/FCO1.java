import java.util.*;
import java.math.*;
class FCO1
{
	public static void main(String[] rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
			int n4=sc.nextInt();
			ArrayList<Integer> al=new ArrayList<>();
			 for (int j=1; i<=Math.sqrt(n1)+1; j++)
        			{
           				 if (n1%j==0)
            					{
              
                				if (n1/j == j)
                    					{
								al.add(j);
							}
      
                				else 
						{
							al.add(j);
							al.add(n1/j);
							
						}
                    					
            					}
        			}
			int count=0;
			for(int k1=0;k1<al.size();k1++)
			{
				for(int k2=0;k2<al.size();k2++)
				{
					for(int k3=0;k3<al.size();k3++)
					{
						int m=al.get(k1);
						int m1=al.get(k2);
						int m2=al.get(k3);
						//System.out.println(m+" "+m1+" "+m2);
						if((m*m1*m2==n1) && (m<=n2) && (m1<=n3) && (m2<=n4))
						{
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}