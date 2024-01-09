package patternprograms;

import java.util.Scanner;

public class ReversePyramidNumbered
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
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}

	}

}
