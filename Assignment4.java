package javapractice;

import java.util.Scanner ;

 class Student {

int sid, rno;
String sname;
float tot, avg;

	public void Read() 
	{
		Scanner sc = new Scanner(System.in);
	
		 
	System.out.println("Enter your student Id :" );
	 sid = sc.nextInt();
	
	System.out.println("Enter your student Name : " );
	sname = sc.next();
	
	System.out.println("Enter your Roll Number : " );
	 rno = sc.nextInt();
		
	System.out.println("Enter your Total obtained Marks : " );
	 tot = sc.nextFloat();
	
	System.out.println("Enter your Average marks : " );
	 avg = sc.nextFloat();
	
	  sc.close();		
	}
	public void showval()
	{
	System.out.println("Enter your student Id  :  " +  sid);
	
	System.out.println("Enter your student Name  :  " +sname);
	
	System.out.println("Enter your Roll Number  :  " +rno );
	
	System.out.println("Enter your Total obtained Marks  : " +tot);
	
	System.out.println("Enter your Average marks :   "  + tot/6 );
	
}
}

 public class Assignment4{
	
  public static void main(String[] args) {
	
	  Student  Sdata = new Student();
	  
	  Sdata.Read();
	  Sdata.showval();
	  
}
	// TODO Auto-generated method stub
}
