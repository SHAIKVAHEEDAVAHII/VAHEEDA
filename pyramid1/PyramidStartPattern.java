package patternprograms;

import java.util.Scanner;

public class PyramidStartPattern
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no.of rows: ");
		int n=scanner.nextInt();
		if(n<=0)
		{
			System.out.println("Please enter teh +ve number.");
			return;
		}
		scanner.close();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			//for star
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
