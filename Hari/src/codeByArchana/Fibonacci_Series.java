package codeByArchana;
import java.util.Scanner;
public class Fibonacci_Series 
{
	/* public static void main(String[] args) 
	{
		 int i; int a = 0; int b = 1; int c;
		 
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
			
			
		}
	} */
	
	public static void main(String[] args) 	//Tribonacci Series
	{
		 int i; int a = 0; int b = 1; int c = 1; int d;
		 
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			
			System.out.println(a);
			d = a+b+c;
			a=b;
			b=c;
			c=d;
			
			
		}
		sc.close();
	}


}
