package test;

import java.util.AbstractMap;

abstract class MyAbstractClass {
	int i=9;
	void print(){
		System.out.println("Abstract.");
	}
}
interface MyInterface{
	int i =10;
	default public void printI(){
		System.out.println("Default");
	};
}
class AbstractClassNInterface implements MyInterface{
	public static void main(String[] args) {
		
	MyAbstractClass abstractClass=new MyAbstractClass() {};
	abstractClass.print();
	AbstractClassNInterface obj=new AbstractClassNInterface();
	obj.printI();
	//abstractClass.i=3;
	System.out.println(abstractClass.i);
	}
	@Override
	public void printI() {
		System.out.println("Overridden");
		
	}}
