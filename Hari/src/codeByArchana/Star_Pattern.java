package codeByArchana;

public class Star_Pattern {

	public static void main(String[] args)
	{
		int i;
		int j;
		int k;
		for(i=1; i<=5; i++)  //Right Triangle
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		for(i=5; i>=1; i--)  //  Inverted right triangle
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		for(i=1; i<=5; i++)  // Left Triangle
		{
			for(k=i; k<5; k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		for(i=5; i>=1; i--)  //  Inverted Left triangle
		{
			for(k=i; k<5; k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		
		for(i=1; i<=5; i++)  //  Square
		{
			
			for(j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		
		
		for(i=1; i<=5; i++)  //  Inverted Left triangle
		{
			for(k=2; k<5; k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
