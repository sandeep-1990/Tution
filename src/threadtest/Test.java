package threadtest;

public class Test extends Thread{

	
	@Override
	public void run() {
		System.out.println("Thread executed");
	}
	
	@Override
	public synchronized void start() {
		super.start();
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.start();
	}
	
}
