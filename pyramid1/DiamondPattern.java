package patternprograms;
import java.util.Scanner;

public class DiamondPattern 
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of rows: ");
		int n=scanner.nextInt();
		if(n<=0)
		{
			System.out.println("please enter the +ve number.");
			return;
		}
		scanner.close();
		
		//logic for diamond pattern
		//for upper triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//for lower triangle
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
