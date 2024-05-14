package codeByArchana;
import java.util.Scanner;

public class If_Else_Statement 
{
	public static void main(String[] args)
	{
		System.out.println("Please Enter Your Number : ");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	 if (num/2==0)
	{
		System.out.println("The Number is Even");
	}
	else
	{
		System.out.println("The Number is Odd");

	}
	 sc.close();
	}
		
}
