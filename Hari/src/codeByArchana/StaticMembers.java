package codeByArchana;

public class StaticMembers
{
	public static void main(String[] args) 
	{
	StaticVariable  a1=new StaticVariable ();
	StaticVariable  a2=new StaticVariable ();
	a1.fun1();
	a2.fun3();
	a1.fun2();
	a2.fun2();
	a1.fun2();
	}
}
class StaticVariable 
{
	int x;
	private static int y;
	
	void fun1()
	{
		x= 12;
		y=22;
	}
	void fun2()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	void fun3()
	{
		y=45;
		x=99;
	}
}