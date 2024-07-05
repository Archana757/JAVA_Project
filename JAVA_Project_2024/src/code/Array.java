package code;

import java.util.*;

public class Array {

	public static void main(String[] args) 
	{

		System.out.println("---------way 1---------");
		int a[] = { 1, 2, 3, 4, 5 };
		String b[] = { "Ruby", "Asp.net", "Java", "C#", "C++", "Python" };
		System.out.println(a[4]);
		System.out.println(b[5]);
		System.out.println(b.length);
		
		System.out.println("---------way 2---------");

		Scanner s = new Scanner(System.in);

		int c[] = new int[5];
		System.out.println("\nEnter Data :   ");
		
		for (int i = 0; i <= 4; i++) 
		{
			c[i] = s.nextInt();
		}
		System.out.println("\n Display data in sequence :  ");
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(c[i]);
		}
		s.close();
	}
}
