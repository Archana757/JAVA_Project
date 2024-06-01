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
		
		
		
		
		for(i=1; i<=5; i++)  //  square with corners only
		{
			
			for(j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			
			
			System.out.print("\n");
		}
		
		
		
		for(i=1; i<=5; i++)  // Triangle
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			 
			System.out.print("\n");
		}
		
		
		for(i=1; i<=5; i++)  //  Hard Triangle
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k+1<=2*i; k++)
			{
				System.out.print("*");
			}
			 
			System.out.print("\n");
		}
		
		
		
		
		
		for(i=1; i<=5; i++)  //  Hard Triangle
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k+1<=2*i; k++)
			{
				System.out.print(k);
			}
			 
			System.out.print("\n");
		}
		
		
		
		
		
		
		for(i='A'; i<='Z'; i++)  // Triangle
		{
			for(j='Z'; j>i; j--)  // this will give you askii value of Char A to Z because we create 
								  // i and j variable as a integer.. to print A and B create variable 
								  //as a char.
			{
				System.out.print(" ");
			}
			for(k='A'; k<=i; k++)
			{
				System.out.print(k);
			}
			 
			System.out.print("\n");
		}
		
		
		
		for(i=1; i<=5; i++)  // Diamond Shape
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
				
			}
			for(k=1; k<=i; k++)
			{
				
				System.out.print("* "); 
			}
			
			System.out.print("\n");
		}
		for(i=1; i<5; i++)  
		{
			for(k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
