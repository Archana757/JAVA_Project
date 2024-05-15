package code;

public class StaticExampleOne {

	public static void common() {
		System.out.println("Static Example One : Common");
		
		StaticExampleOne obj = new StaticExampleOne();
		obj.notStatic();
	}
	
	public void notStatic() {
		System.out.println("Static Example One : Non Static");
		notStaticPrivate();
	}
	
	private void notStaticPrivate() {
		System.out.println("Static Example One : Non Static Private");
		
	}
}
