package typeCasting;

public class B extends A {

	void upCasting() {
		System.out.println("this is child class");
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.upCasting();
		
		
	}
}
