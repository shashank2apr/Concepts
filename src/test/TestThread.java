package test;

class SubclassThread {
	public static synchronized void printName() {
		System.out.println("printName");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void printvalue() {
		System.out.println("printvalue");
	}
}

public class TestThread extends Thread {
	SubclassThread b = new SubclassThread();

	public static void main(String[] args) {
		TestThread t = new TestThread();
		Thread t1 = new Thread(t, "t1");
		Thread t2 = new Thread(t, "t2");
		t1.start();
		t2.start();
	}
	@Override
	public void run(){
		if(Thread.currentThread().getName().equals("t1")){
			b.printName();
		} else{
			b.printvalue();
		}
	}
}
