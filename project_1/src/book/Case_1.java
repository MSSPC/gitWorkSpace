package book;

class Test {
	public static int x = 100;
	public static int y = 200;

	public Test() {
		System.out.println("gouzao");
	}

	//this will implement once when the class was initialized.
	static {
		System.out.println("static kuai");
	}

	public static void display() {
		System.out.println("static method");
	}

	public void diaplay_1() {
		System.out.println("fei static method");
	}
}

public class Case_1 {
	public static void main(String[] arg) {
		System.out.println(Test.x);

	}
}
