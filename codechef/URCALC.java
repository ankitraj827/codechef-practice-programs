import java.util.*;
class URCALC
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		char ch=sc.next().charAt(0);
		if(ch=='+')
		{
			int c=(int)a+(int)b;
			System.out.println(c);
		}
		else if(ch=='-')
		{
			int c=(int)a-(int)b;
			System.out.println(c);
		}
		else if(ch=='*')
		{
			int c=(int)a*(int)b;
			System.out.println(c);
		}
		else if(ch=='/')
		{
			System.out.println(a/b);
		}
	}
}