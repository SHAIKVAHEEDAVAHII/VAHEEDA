package patternprograms;

import java.util.Scanner;

public class PyramidNumberPattern 
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
		
		for (int i = 1; i <= n; i++) {
            // Loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Loop to print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Loop to print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
		
		

	}

}
