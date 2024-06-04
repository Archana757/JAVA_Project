package codeByArchana;
import java.util.Scanner;
public class Matrix 
{
		public static void main(String[] args) 
		{
			int a[][]=new int[2][2];
			int b[][]=new int[2][2];
			int c[][]=new int[2][2];
			int d[][]=new int[2][2];
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Elements in First Matrix: \n");
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
			
			
			
		}
}
