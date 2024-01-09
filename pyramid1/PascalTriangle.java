package patternprograms;
import java.util.Scanner;

public class PascalTriangle 
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
		for(int i=1;i<=n;i++)
		{
			
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int number=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(number + " ");
                number = number * (i -k)/k;
				
			}
			System.out.println();
		}
	}
}
		

