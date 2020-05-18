package lamdatest;

public class ThreadTest {

	
	public static void main(String[] args) {
		
		
		Runnable runnable = ()->{
//			System.out.println("Thread start");
			for(int i=0; i<=10; i++){
				System.out.println("Thread : "+i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		
		
	}
	
	
	
}
