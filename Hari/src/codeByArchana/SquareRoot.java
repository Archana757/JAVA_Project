package codeByArchana;

import java.util.Scanner;
class SquareRoot
{
	public static void main(String[] args)
	{
	System.out.println("Please Enter any Number : ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
	for(int i=1; i<=n; i++)
	{
	   int factor = n%i;
	   int a = factor/factor ;
	   if(a == 1)
		{
			int sqr = n/factor;
		  System.out.println(sqr);	
		}
		else
		{
		  System.out.println("It has no square root");
		}
	}

	sc.close();
	}
}


