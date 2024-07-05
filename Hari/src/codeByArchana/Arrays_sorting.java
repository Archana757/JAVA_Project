package codeByArchana;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays_sorting {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter data in Array.");
		Scanner sc=new Scanner(System.in);
		
		// .sort to get sorting elements in arrays.
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Sorting data in Array.");
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +" ");		
		}
		
		// .equals in arrays gives true/false value if whole elements are same in Arrays. 
		System.out.println("\nEnter data in Array a.");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Enter data in Array b.");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();	
		}
		if(Arrays.equals(a, b))
		{
			System.out.println("Both Arrays are same");
		}
		else
		{
			System.out.println("Both Arrays are not same");
		}
		
		
		
		boolean B = Arrays.equals(a, b);
		System.out.println("Is your data same in both Arrays : " +B);
		
		// .copyOf method to get same copy of Arrays.
		
		System.out.println("Enter data in Array to get copy of it.");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Your copied Array is.");
		int c[] = Arrays.copyOf(a, 7);
		c[3]=24;
		c[6]=35;
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i] +" ");		
		}
		
		 
		
		
		sc.close();
	}

}