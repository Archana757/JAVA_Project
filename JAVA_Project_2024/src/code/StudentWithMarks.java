package code;


public class StudentWithMarks 
{
	
	private int total = 0;
	
	public int getMarks() 
	{
		Marks marksObj = new Marks();
		addTotal(marksObj.getMarksMaths());
		addTotal(marksObj.getMarksScience());
		return total;		
	}
	
	private void addTotal(int marks) 
	{
		total = total + marks;
	}
}
