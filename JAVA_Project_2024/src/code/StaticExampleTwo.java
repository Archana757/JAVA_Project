package code;

public class StaticExampleTwo {

	public static void common() {
		System.out.println("Static Example Two : Common");
	}
	
	private static void commonPrivate() {
		System.out.println("Static Example Two : Common Private");
	}
	
	public static void main(String[] args) {
		common();
		commonPrivate();
		
		StaticExampleOne obj = new StaticExampleOne();
		
		StaticExampleOne.common();
		obj.notStatic();
		
		StudentWithMarks stdObj = new StudentWithMarks();
		System.out.println("Student Marks: " + stdObj.getMarks());
	}
}
