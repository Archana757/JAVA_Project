package codeByArchana;

class A 
{
	int x;
	static int y;
	public int z; public static int c;
	private static int a; private int b;
	
	void fun1()// default and non static method
	{
		System.out.println("Hello");
		System.out.println(x=32);
	
	}
	static void fun2() // default static method
	{
		System.out.println("How are you");
		A obj1 = new A();
		System.out.println(obj1.x=100);
	}
	public static void fun3()  // public static method
	{
		System.out.println("Good morning");
		System.out.println(a=15);
		A a1=new A();
		a1.fun6();
	}
	public void fun4()  // public non-static method
	{
		System.out.println("tea");
		fun5();  //in non static method we can call static method easily..
		         //and private method we can call in same class in any method..
	}
	private static void fun5() // private static method
	{
		System.out.println("Coffee");
		System.out.println(y=21);
		A obj=new A();
		obj.x=21;
		obj.z=9;
		a=99;
		System.out.println(obj.x +"  " + obj.z);	
	}
	private void fun6()  // private non-static method
	{
		a=99; b= 88;
		System.out.println("Cold drinks");
		System.out.println(a+b);
	}
}

class C
{
	public void f1()
	{
		A.fun2();
		A a2 = new A();
		a2.fun1();
		A.y=71;
		System.out.println(a2.x);
		a2.fun4();
	}
}

