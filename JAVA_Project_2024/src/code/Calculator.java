package code;

public class Calculator {

	// public static void main function is used to execute code which does not require any object
	// when you don't want to create a object of that class you can use static functions.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 24;
		int y = 38;
		System.out.println("x + y = " + (x + y) );
		
		x = 21;
		y = 45;
		System.out.println("x -  y = " + (x - y) );
		
		x = 02;
		y = 39;
		System.out.println("x * y =" +(x * y));
		
		x = 58;
		y = 14;
		System.out.println("x / y = " + (x / y) );
		 
		x = 31;
		y = 11;
		System.out.println("x % y = " + (x % y) );
		
	
	    calc();
		
	}
		static void calc() {
			System.out.println("Inside calc");
	}
}
