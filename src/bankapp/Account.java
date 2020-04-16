package bankapp;

public class Account {

	long balance = 1000;

	public void increment() {
		System.out.println("before incremtn : " + balance);
		synchronized (this) {
			balance += 1000;
		}
		System.out.println("after increment : " + balance);

	}

	public synchronized void decrement() {
		System.out.println("before decrement: " + balance);
		synchronized(this){
			balance -= 1000;
		}
		System.out.println("after decrement : " + balance);
	}

}
