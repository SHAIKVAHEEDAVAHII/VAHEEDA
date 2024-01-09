package patternprograms;
import java.util.Scanner;
import java.util.ArrayList;

public class LeftTriangleNumbered
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the numer of rows: ");
		int n=scanner.nextInt();
		if(n<=0)
		{
			System.out.println("Please enter the +ve number");
			return;
		}
		
		//logic for left numbered triangle
		
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		
		//for reverse left numbered triangle
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
