import java.util.*;
class MCH2
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int n2=sc.nextInt();
			double sum=0;
			for(int j=0;j<n2;j++)
			{
				double h1=sc.nextDouble();
				double h2=sc.nextDouble();
				double h3=sc.nextDouble();
				double increase=h1+(h1*h3)/100.0;
				double decrease=increase-(increase*h3)/100.0;
				double total=h2*(h1-decrease);
				sum=sum+total;
			}
			System.out.println(sum);
		}
	}


}