package codeByArchana;
import java.util.Scanner;

public class NestedIfElse_01 

{

  public static void main(String[] args)
   {
	  int girl;
	   int boy;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your girl age :");
    girl=sc.nextInt();
    System.out.println(girl);
    System.out.println("enter your boy age :");
    boy=sc.nextInt();
	System.out.println(boy);
	

  if(girl>=18 && boy>=21)
    {
	if(girl>=23 && boy>=26)
	{
	System.out.println("Good age to have a baby...");
    }
	else
	{
	System.out.println("Time for save money...");
	}
    }
  else
    {
	if(girl>=13 && boy>=16)
	{
	System.out.println("Try to focus on Study...");
    }
	else
	{
	System.out.println("Calling Nibba Nibbi Love...");
	}

    }
  		sc.close();
   }

}


