package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class Test4 {
	
	class Inner{
		boolean flag=false;
		void test(){
			if(flag){
				Test4.this.sample();
			}
		}
	}
	
	private boolean flag = true;
	
	public void sample(){
		System.out.println("OUT SAMPLE !");
	}
	public Test4(){
		(new Inner()).test();
	}
	
	public static void main(String[] args) {
		new Test4();
		List<String> result = new ArrayList();
		result.add("aaa");
		result.add("bbb");
		String[] str=result.toArray(new String[0]);
		for(String s:str){
			System.out.println(s);
		}
		Stack<String> stack = new Stack<>();
	}
}
