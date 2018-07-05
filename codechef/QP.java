import java.util.*;
class QP
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int []a=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n2;j++)
		{
			int n3=sc.nextInt();
			int n4=sc.nextInt();
			int n5=sc.nextInt();
			if(n3==1)
			{
				a[n4-1]=n5;
			}
			else if(n3==2)
			{
				ArrayList<Integer> al=new ArrayList<>();
				for(int k=n5-2;k>n4-1;k--)
				{
					al.add(a[k]);
				}
				Collections.sort(al,Collections.reverseOrder());
				//System.out.println(al);
				outer:
				for(int i1=0;i1<al.size();i1++)
				{
					int temp;
					boolean isPrime=true;
					int num=al.get(i1);
					for(int i=2;i<=num/2;i++)
					{
           					temp=num%i;
	  				 	if(temp==0)
	   					{
	     				 		isPrime=false;
	      						break;
	   					}
					}
					if(isPrime)
					{
	   					System.out.println(num);
						break outer;
					}
				}
			}
			else if(n3==3)
			{
				ArrayList<Integer> al=new ArrayList<>();
				for(int k=n5-2;k>n4-1;k--)
				{
					al.add(a[k]);
				}
				Collections.sort(al,Collections.reverseOrder());
				//System.out.println(al);
				outer:
				for(int i1=0;i1<al.size();i1++)
				{
					int temp;
					boolean isPrime=true;
					int num=al.get(i1);
					for(int i=2;i<=num/2;i++)
					{
           					temp=num%i;
	  				 	if(temp==0)
	   					{
	     				 		isPrime=false;
	      						break;
	   					}
					}
					if(isPrime)
					{
	   					
					}
					else
					{
						System.out.println(num);
						break outer;
					}
				}
			}
		}
	}


}