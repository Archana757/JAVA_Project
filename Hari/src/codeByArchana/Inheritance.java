package codeByArchana;

import java.util.Scanner;

public class Inheritance {

	public static void main(String[] args) 
	{
		Rectangle re = new Rectangle();

		re.square();
		TriSquare.triangle();
		Circle_ellipse.Circle();
		re.Ellipse();
		
		

	}

}

class TriSquare
{
	public void square()
	{
	System.out.println("Enter length of side to check area of Square : ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("Area of Square is : " +(a*a));
	}
	public static void triangle()
	{
	System.out.println("Enter base and height to check area of Triangle : ");
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	int h = sc.nextInt();
	System.out.println("Area of Triangle is : " +(b*h)/2);
	}	
}

class Circle_ellipse extends TriSquare
{
	static float pi = 3.14f;
	
	public static void Circle()
	{
	System.out.println("Enter your radius to check area of Circle : ");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	
	System.out.println("Area of circle is : " +(pi*(r*r)));
	}
	
	public void Ellipse()
	{
	System.out.println("Enter your value to check area of Ellipse : ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Area of Ellipse is : " +pi*(a*b));
	}
}

class Rectangle extends Circle_ellipse
{
	int w; int h;
	Rectangle()
	{
	System.out.println("Enter width and height to check area of Rectangle : ");
	Scanner sc = new Scanner(System.in);
	w = sc.nextInt();
	h = sc.nextInt();
	System.out.println("Area of Rectangle is : " +(w*h));
	}	
}
