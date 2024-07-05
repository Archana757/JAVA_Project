package codeByArchana;

public class Constructors 
{

	public static void main(String[] args) 
	{
		Abc a1 = new Abc(100, 200);
		
		Abc a2 = new Abc("Archana", 2);
		
		System.out.println(a1.x+ "  "+ a1.y + "  " + a2.s + "  " + a2.i );

	}

}

class Abc
{
	int x; int y;
	Abc(int a, int b)
	{
		 x = a;   y = b;
	}
	
	/* void show()
	{
		System.out.println(x+"  "+y);	
	} */
	
	String s; int i;
	Abc(String a, int b)
	{
		s = a;   i=b;
		System.out.println(s+"  "+i);	
	}

	

}
