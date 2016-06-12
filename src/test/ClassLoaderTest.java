package test;


public class ClassLoaderTest {
	
	public static void main(String[] args) {
		new ClassB().printB();
		
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassB.class.getClassLoader());
		System.out.println(BinaryAdd.class.getClassLoader());
	}
	
}
