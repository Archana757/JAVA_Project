package codeByArchana;
import java.util.Scanner;
public class Arrays
{
	public static void main(String[] args)
	{
	  int a[]=new int[5];
	  System.out.println("Enter your elements in Array form.");
	  Scanner sc=new Scanner(System.in);
	          
	for(int i=0; i<a.length; i++)
	{
		 a[i]=sc.nextInt();
	}
	for(int i=0; i<a.length; i++)
	{
	  System.out.println("Printing Elements : " +a[i]);
	}
	for(int i=a.length-1; i>=0; i--)
	{
	  System.out.println("Printing Elements in reverse order : " +a[i]);
	}
	
  	   System.out.println("Printing Arrays length or size : " +a.length);
  	   
  	   
  	 sc.close();
	}
	

	
}