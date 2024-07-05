package codeByArchana;
import java.util.Scanner;

public class Array_02
{

	public static void main(String[] args)
	{
		int a[]=new int[5];
		int sum=0; int count=0;
		System.out.println("Enter Elements in Array.");
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Arrays elements are : ");

		for(int i=0; i<a.length; i++)
		{
		  System.out.print(a[i] + "  ");
		}

		for(int i=0; i<a.length; i++) 
		{
			sum = a[i]+sum;
			count++;
		}
		float Average = sum/count ;
		System.out.println("\nYour entered elements average is : " +Average);
		
	// Find Max/min element in Arrays.
	
		System.out.println("Arrays elements are : ");

		for(int i=0; i<a.length; i++)
		{
		  System.out.print(a[i] + "  ");
		}
		int Max=a[0];
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]<a[i+1])
			{
				 Max = a[i+1];
			}
		}
		System.out.println("\nMaximum Element is : " +Max);
		
	
		int Min = a[0];
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				Min=a[i+1];
			}
		}
		System.out.println("Minimum Element is : " +Min);
		
	
	sc.close();
	
	
	
	}

	
	
	
	
	
	
	
	
	
}
