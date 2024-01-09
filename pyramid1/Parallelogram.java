package patternprograms;

import java.util.Scanner;

public class Parallelogram {

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
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		

	}

}
