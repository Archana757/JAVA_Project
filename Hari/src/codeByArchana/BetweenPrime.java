package codeByArchana;

import java.util.Scanner;
public class BetweenPrime
{
	public static void main(String[] args)
	{
	  System.out.println("Enter First number..");
	  Scanner sc =new Scanner(System.in);
	  int n1=sc.nextInt();
	  System.out.println("Enter Second number..");
	  int n2=sc.nextInt();
	  int i, num;
	  
	for(num=n1; num<n2; num++)
	{
		boolean prime = true;
	   for(i=2; i<num; i++)
	   {
	      if(num%i==0) 
	      {
	    	 prime = false;
	    	 break;
	      }
	   }
	   if(prime)
	   {
		   System.out.println("prime number is :" +num);
	   }
	   sc.close();
	}
	
	}
}