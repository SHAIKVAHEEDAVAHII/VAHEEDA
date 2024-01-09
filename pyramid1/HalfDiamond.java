package patternprograms;
import java.util.Scanner;

public class HalfDiamond 
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
		
		//for upper triangle
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		//for lower triangle
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
