package patternprograms;

import java.util.Scanner;

public class PascalStar
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
		
		//logic for pascal triangle
		System.out.println("The pascal triangle is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
		//for reverse logic
		System.out.println("The reverse pascal triangle is:");
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
