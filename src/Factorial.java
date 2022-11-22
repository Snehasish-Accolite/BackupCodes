import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number- ");
		int num= scan.nextInt();
		int fac = factorial(num);
		System.out.println(fac);
		
		

	}

	private static int factorial(int num) {
		if(num==0)
		{
			return 1;
		}
		else
		{
			return( num* factorial(num-1));
		}
			}

}
