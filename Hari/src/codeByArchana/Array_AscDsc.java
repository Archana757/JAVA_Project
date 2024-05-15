package codeByArchana;
import java.util.Scanner;
public class Array_AscDsc 
{

    public static void main(String[] args) 
	{
		int a[]=new int[5];
		int temp;
		System.out.println("Enter your elements.");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are.");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");
		}
	
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nElements is in Ascending order : ");
		for(int i=0; i<a.length; i++)
		{
		System.out.print(a[i] +" ");
		}
		
		
		System.out.println("\nElements is in descending order : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
		System.out.print(a[i] +" ");

		}

		}
	
    
}

	
	
