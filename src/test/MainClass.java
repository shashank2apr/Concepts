package test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainClass {
	public static void main(String[] args) throws SecurityException {
		try {	
			callByReflection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// new ClassB().print();
	}

	/**
	 * @throws SecurityException
	 * @throws IOException
	 */
	private static void callByReflection() throws SecurityException,
			IOException {
		try {
			Class classB = Class.forName("test.ClassB");
			Method[] methods = classB.getDeclaredMethods();
			for (Method m : methods) {
				try {
					m.invoke(classB.newInstance(), null);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | InstantiationException e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new IOException();
		}
	}

}
