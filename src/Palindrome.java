import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=scan.next();
		Boolean res;
		res=isPalindrome(str);
		System.out.println("Palindrome: "+ res);

	}

	private static Boolean isPalindrome(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
