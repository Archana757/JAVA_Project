package codeByArchana;

public class B
{
public static void main(String[] args) 
{
	A a1=new A();
	a1.x=41;
	A.y=23;
	System.out.println(A.c);
	System.out.println(a1.x + "  "+A.y);
	
	
	a1.fun1(); 
	A.fun2();
	A.fun3();
	a1.fun4();
	
	C c1 = new C();
	c1.f1();
}
 
}
