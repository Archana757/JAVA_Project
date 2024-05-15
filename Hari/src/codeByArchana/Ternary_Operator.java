package codeByArchana;
import java.util.Scanner;
public class Ternary_Operator 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter numbers..");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Max;
		
		
		Max = ((a > b && a > c) ? a : (b > a && b > c) ? b : c);
		System.out.println("Your Maximum Number is : " +Max);
	sc.close();
	}
}
