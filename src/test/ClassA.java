package test;

public class ClassA {

	public static void main(String[] args) {
		// new ClassTest();
		new ClassA().print();
	}

	public void print() {
		System.out.println("A");
		new ClassTest();
	}
}

class ClassTest {
	static {
		print("static");
	}
	{
		print("init");
	}

	ClassTest() {
		print("constructor");
	}

	static void print(String str) {
		System.out.println(str);
	}
}
