package patternprograms;

import java.util.Scanner;

public class HollowNumbered
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
		
		//logic foe upper triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j )
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		//for lower triangle
		for(int i=n+1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j )
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		//half upper hollow complete
		System.out.println("The half upper hollow trainagle is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j ||i==n )
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		System.out.println("The half lower hollow trainagle is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i==1 || i==j ||j==n )
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		System.out.println("The half lower hollow trainagle is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==j ||j==n )
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		
		
		
	}

	}


