package codeByArchana;


		import java.util.Scanner;
		public class AreaOfShapes
		{
		
			public static void main(String[] args)
			{
			  System.out.println("Enter your shape(Circle/Square/Rectangle/Triangle/) to know Area..");
			   Scanner sc = new Scanner(System.in);
			   String Shape = sc.next();

			switch(Shape)
			{
			 case "Circle" :
				System.out.println("Enter Your Circle's Diameter : ");
		 
				double D = sc.nextDouble();
			  	final double pi = 3.14;
			    	double r = D/2 ;
				System.out.println("Circle's radious r : " +r);
			    	double areaofcir = pi*r*r ;

				System.out.println("Area of Circle is : " +areaofcir);
				break;

			case "Square" : 
				System.out.println("Enter your Square's sides value : ");

				int a = sc.nextInt();
				int areaofsqr = a*a ;
				System.out.println("Area of Square is : " +areaofsqr);
				break;

			case "Rectangle" : 
				System.out.println("Enter your Rectangle's height and width value : ");

				int h = sc.nextInt();
				int w = sc.nextInt();
				int areaofrec = h*w ;
				System.out.println("Area of Rectangle is : " +areaofrec);
				break;

			case "Triangle" :
				System.out.println("0 for 3 side, 1 for base");
				int triangleType = sc.nextInt();
				
			
				if(triangleType == 0)
				{ 
				System.out.println("Enter your Triangle's Three sides value : ");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				int sp = (x+y+z)/2 ;
				double areaoftri = Math.sqrt(sp*(sp-x)*(sp-y)*(sp-z)) ;
				System.out.println("Area of Triangle is : " +areaoftri);
				}
				else
				{
				System.out.println("Enter your Triangle's base and height value : ");
				int base = sc.nextInt();
				int height = sc.nextInt();
				int areaoftriangle = (base * height)/2;
				System.out.println("Area of Triangle is : " +areaoftriangle);
				}
				
				break;
			default :
				System.out.println("Enter valid operations : ");


			} 
			sc.close();
			   	

			}


		

	}


