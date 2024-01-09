package patternprograms;

import java.util.Scanner;

public class LeftTrainaglePattern
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
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
