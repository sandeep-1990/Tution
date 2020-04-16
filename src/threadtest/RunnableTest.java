package threadtest;

public class RunnableTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread exec");
	}

	public static void main(String[] args) {
		RunnableTest test = new RunnableTest();
		Thread thread = new Thread(test);
		thread.start();
	}
}
