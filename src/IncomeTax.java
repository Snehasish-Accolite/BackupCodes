import java.util.*;
public class IncomeTax {

	
	public static void main(String[] args) {
		double income,taxRates,tax;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the income-");
		income =scan.nextDouble();
		tax= findtax(income);
		System.out.println("The tax is " + tax);
				
		
	}

	private static double findtax(double income) {
		
		if (income<=300000)
		{
			return income;
		}
		else if(income>=300001 && income<=500000)
		{
			return (0.1 * (income-300000));
		}
		else if (income>=500001 && income<=1000000)
		{
			return (20000 + 0.2*(income - 500000));
		}
		else if (income>=1000001)
		{
			return(120000 + 0.3*(income-1000000));
		}
		else
		{
			
		}
		return 0;
	}

}
