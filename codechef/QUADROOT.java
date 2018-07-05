import java.util.*;
class QUADROOT
{
	public static void main(String []rk)
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double root1, root2;

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println(root1);
	System.out.println(root2);	
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.println(root1);
	    System.out.println(root2);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("%.2f%.2fi",realPart,imaginaryPart);
		System.out.println();
		System.out.format("%.2f-%.2fi",realPart,imaginaryPart);
        }
	}
}