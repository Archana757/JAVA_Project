package codeByArchana;
import java.util.Scanner;
public class SumOfOddEven 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your Number :");
		Scanner r = new Scanner(System.in);
		int n = r.nextInt();
		int i;
		int sum=0;
		r.close();
		
			if(n%2==0) 
			{
				for(i=0; i<=n; i=i+2)
				sum = sum + i;
			System.out.println("Sum of Even Number is : " + sum);	
			}
			else 
			{
				for(i=1; i<=n; i=i+2)
				sum = sum + i;
			System.out.println("Sum of odd Number is : " + sum);	
			}
			
		

	}

}


