import java.util.Scanner;

public class TwoPoints {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter X position-");
		int j=scan.nextInt();
		System.out.println("Enter Y position-");
		int k=scan.nextInt();
		
		int ans=computePointOfInterception(j,k);
		System.out.println(ans);
	}

	public static int computePointOfInterception(int a, int b) {

//		int a=x%12;
//		int b=y%12;
		if(b!=a)
		{
			for(int i=b+1;i<=24;i++)
			{
				if(((i-a)/(i-b))%2==0)
				{
					if(i>12)return i%12;
					else return i;
				}
			}
		}
		

		return 0;
	}

}
