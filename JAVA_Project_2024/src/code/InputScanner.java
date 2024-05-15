package code;
import java.util.Scanner;

public class InputScanner 
{
	
	/* public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your Mathematics Marks" );
		Float m1 = sc.nextFloat();
		System.out.println("enter your English Marks" );
		Float m2 = sc.nextFloat();
		System.out.println("enter your Physics Marks" );
		Float m3 = sc.nextFloat();
		System.out.println("enter your Chemistry Marks" );
		Float m4 = sc.nextFloat();
		System.out.println("enter your Biology Marks" );
		Float m5 = sc.nextFloat();
		Float x = m1+m2+m3+m4+m5 ;
		System.out.println("Your total marals is : " +(x)+ " out of 500");
		Float y = x/5 ;
		System.out.println("your percentage is : " + y + "%");
		
		 if((m1>= 35 && m2>= 35 && m3>= 35 && m4>= 35 && m5>= 35)|| y >= 60)
		{
			System.out.println("Congratulations, You are passed");
		}
		else
		{	
			System.out.println("Better luck next time"); 
		}*/
		
		
		

		
        
		
		
		
		
		
		
		
		
		
		
		
	public static void main (String[] args)
	{
		
		System.out.println("Please enter your Name");
		Scanner sc= new Scanner(System.in);
		String Name = sc.nextLine();
		System.out.println ("Hello   "  +  Name  +  "   Have a good day");
		System.out.println("Please Enter one Number to check km to miles");
		    double x = sc.nextDouble();
				double  y = x/1.61 ;
		System. out.println( x  + "  kilometer = "  + y + "   Miles");
		
		sc.close();
	}

}
