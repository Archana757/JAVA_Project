package codeByArchana;
// import java.util.Scanner;
public class Matrix 
{
		public static void main(String[] args) 
		{
		/*	int a[][]=new int[2][2];
			int b[][]=new int[2][2];
			int c[][]=new int[2][2];
			int d[][]=new int[2][2];
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Elements in First Matrix: \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
				a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter Elements in Second Matrix");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
				b[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter Elements in Third Matrix");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
				c[i][j]=sc.nextInt();
				}
			}
			
			System.out.print("First Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
					System.out.print(a[i][j] +" ");
				}
				System.out.print("\n");
			}
			
			System.out.print("Second Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
					System.out.print(b[i][j] + " ");
				}
				System.out.print("\n");
			}
			
			System.out.print("Third Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
					System.out.print(c[i][j] +" ");
				}
				System.out.print("\n");
			}
			
			
			System.out.print("Addition of Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
					d[i][j]=a[i][j]+b[i][j]+c[i][j];
				System.out.print(d[i][j] +" ");
				
				}
				System.out.print("\n");
			}
			
			System.out.print("Transpose Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=0;j<2; j++)
				{
				System.out.print(d[j][i] +" ");
				
				}
				System.out.print("\n");
			}
			
			System.out.print("Mirror Matrix : \n");
			for(int i=0; i<2; i++)
			{
				for(int j=1;j>=0; j--)
				{
				System.out.print(d[i][j] +" ");
				
				}
				System.out.print("\n");
			}  */
			
			
			int a[][]= {{1,2,3},{4,5,6}};
			int b[][]= {{3,5,6},{1,2,7}};
			int result[][]= {{0,0,0},{0,0,0}};
			
			System.out.print("First matrix is : \n");
			
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++)
				{
					 System.out.print(a[i][j] +" ");
				}
				System.out.print("\n");
			}
			
			System.out.print("Second matrix is : \n");
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++)
				{
					 System.out.print(b[i][j] + " ");
				}
				System.out.print("\n");
			}
			
			System.out.print("The result is :\n" );
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++)
				{
					 result[i][j]= a[i][j]+b[i][j];
					 System.out.print(result[i][j] + " ");
				}
				System.out.print("\n");
			}
			
		}
}
