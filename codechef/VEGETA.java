import java.util.*;
class VEGETA
{
	public static int primeFactors(int n)
    	{
	TreeSet<Integer> t1=new TreeSet<>();
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            t1.add(2);
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                t1.add(i);
                n /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
		{
               	t1.add(n);
		}
	return t1.size();

    }
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		for(int i1=0;i1<n1;i1++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int sum=0;
			if(m<=2 || n==m)
			{
				System.out.println("0");
			}
			else
			{
				for(int i=n;i<=m-1;i++)
				{
					sum=sum+primeFactors(i);
				}
			}
			System.out.println(sum);
			
		}
	}
}