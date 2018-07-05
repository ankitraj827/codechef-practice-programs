import java.util.*;
class PRAC01
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		while(n>1)
		{
			int k=n%2;
			str=str+Integer.toString(k);
			n=n/2;
		}
		String rev=new StringBuffer(str).reverse().toString();
		char ch=rev.charAt(rev.length()-1);
		if(ch=='1')
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}


}