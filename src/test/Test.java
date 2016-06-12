package test;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



class Parent implements Externalizable{
	private void a(){
		
	}
	public Object readResolve(){
		return null;
		
	}
	@Override
	public void writeExternal(ObjectOutput paramObjectOutput)
			throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput paramObjectInput) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}

class Child extends Parent{
	
}
public class Test extends Child implements I{
	
private void a(){
		
	}
	public static void main(String[] args)  {
		Outer out = new Outer();
		out.show();
		String s[]={"a","f"};
		try
        {
            throw new ArithmeticException();
        } catch (Exception e)
        {
          System.out.println( e.getClass().getCanonicalName()); 
        }
		/*Test p = new Test();
		p.a();
		List<E> list = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		//list.remove(0);
		Stack<Integer> stack=new Stack<>();
		stack.push(2);
		stack.push(4);
		stack.push(null);
		System.out.println(stack.pop());
		System.out.println(stack.peek());*/
	}
	public void findFile() throws FileNotFoundException{
	
	}
	
}
interface I{
	public void findFile() throws FileNotFoundException;
}
class Outer {
    void show() {
        System.out.println("outter show");
    }

    class Inner{
        void m() {
        	show();
            System.out.println("inner show");
        }
    }
}
