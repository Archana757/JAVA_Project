package codeByArchana;
import java.util.Scanner;

public class Recursion 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find factor : ");
		
		 int b = sc.nextInt();
		 
		 
		   
		System.out.println("Factor of given number : " +factor(b));
	}
	
	static int factor(int a)
	{
		if(a>1)
		{
			return a*factor(a-1);
		}
		else
		{
			return 1;
		}
		
	}

}
